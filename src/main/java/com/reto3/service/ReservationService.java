/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.service;

import com.reto3.model.Reservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.reto3.repository.ReservationRepository;

/**
 *
 * @author RAF
 */
@Service
public class ReservationService {
    @Autowired
    ReservationRepository rserva;
    
//    public List<Reserva> filtro(){
//       
//    }
    
    
}
