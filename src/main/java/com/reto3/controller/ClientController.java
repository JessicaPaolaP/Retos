/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.controller;

import com.reto3.model.Client;
import com.reto3.service.ClientService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JessicaPulido
 */
@RestController
@RequestMapping("/api/client")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ClientController {

    @Autowired
    private ClientService clienteService;

    @GetMapping("/all")
    public List<Client> consultarClientes() {
        return clienteService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client insertarCliente(@RequestBody Client cliente) {
        return clienteService.guardar(cliente);
    }

    @GetMapping("/{id}")
    public Optional<Client> getClient(@PathVariable("id") int clientId) {
        return clienteService.getCliente(clientId);
    }

    @PutMapping("/update")
    @ResponseStatus(code=HttpStatus.CREATED)
    public Client update(@RequestBody Client client) {
        return clienteService.update(client);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int clientId) {
        return clienteService.deleteCliente(clientId);
    }
    

    
//    @PutMapping("/update")
//    public ResponseEntity updateDepartamento(@RequestBody Departamento departamento) {
//        service.updateDepartamento(departamento);
//        return ResponseEntity.status(201).build();
//    }

}
