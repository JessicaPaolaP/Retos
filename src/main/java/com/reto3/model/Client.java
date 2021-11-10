/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author JessicaPulido
 */
@Entity
@Table(name="Client")
public class Client implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idCliente;
    
    @Column(name="nombreCompleto", nullable=false, length=60)
    private String nombre;
    @Column(unique=true, length=80)    
    private String correo;
    @Column(columnDefinition="int(2) check(valor<6), check(valor>=0)")
    private int valor;  
    
     private LocalDate fechaRegistro = LocalDate.now();


    public Client(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public Client() {
    }

    public Client(Integer idCliente, String nombre, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
    }
    
    
    

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", correo=" + correo + '}';
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFechaRegistro() {
        return Date.from(fechaRegistro.atStartOfDay(ZoneId.of("Etc/GMT-0")).toInstant());
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
    
}
