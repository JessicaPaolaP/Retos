/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.service;

import com.reto3.model.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reto3.repository.ClientRepository;

/**
 *
 * @author RAF
 */
@Service
public class ClientService {

    @Autowired
    private ClientRepository clienteRepository;

    public Client guardar(Client cliente) {
       int valor= clienteRepository.countRecords(cliente.getNombre());
       if (valor < 1){
          clienteRepository.save(cliente);
          return cliente;
       }else{
          Client c = new Client("nombre condicion", "correo condicion"+valor+1); 
          clienteRepository.save(c);
          
          return c;
       }
         
    }

    public List<Client> getAll() {
        return clienteRepository.findAll();
    }

    public Optional<Client> getCliente(int clientId) {
        return clienteRepository.findById(clientId);
    }
    
    public boolean deleteCliente(int clientId) {
        Boolean resultado = getCliente(clientId).map(client -> {
            clienteRepository.delete(client);
            return true;
        }).orElse(false);
        return resultado;
    }
    
   public Client update(Client client){
        if(client.getIdCliente()!=null){
            Optional<Client> obj = clienteRepository.findById(client.getIdCliente());
            if(obj.isPresent()){
                if(client.getNombre()!=null){
                    obj.get().setNombre(client.getNombre());
                }

                if(client.getCorreo()!=null){
                    obj.get().setCorreo(client.getCorreo());
                }
                clienteRepository.save(obj.get());
                return obj.get();
            }else{
                return client;
            }
        }else{
            return client;
        }
    }
   
   
    

}
