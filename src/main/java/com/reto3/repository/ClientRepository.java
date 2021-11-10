/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.repository;

import com.reto3.model.Client;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RAF
 */

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{
    
    	@Query(value = "select count(*) as total from Clientes where nombrecompleto = ?", nativeQuery = true)
	int countRecords (String nombre); 
        
        
        //@Query(value = "select * from Reservas where fechaInicio >  ? and fechaInicio<?", nativeQuery = true)
        //public List<Cliente> findAllByStartDateAfterAndStartDateBefore(Date dateOne,Date dateTwo );
}
