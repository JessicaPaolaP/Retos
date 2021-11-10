/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.repository;

import com.reto3.model.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author RAF
 */
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
    
}
