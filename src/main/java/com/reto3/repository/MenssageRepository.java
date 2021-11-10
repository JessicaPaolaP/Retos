/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.repository;

import com.reto3.Interface.InterfaceMenssage;
import com.reto3.model.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class MenssageRepository {
          @Autowired
    private InterfaceMenssage crud3;
    public List<Message> getAll(){
        return (List<Message>) crud3.findAll();
    }
    public Optional<Message> getMessage(int id){
        return crud3.findById(id);
    }

    public Message save(Message message){
        return crud3.save(message);
    }
     public void delete(Message mensaje){
        crud3.delete(mensaje);
    }
    
}
