/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reto3.sa.practica.reto3grupo5g8.repository;

import com.reto3.sa.practica.reto3grupo5g8.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Don-Jaime
 * repositorio
 * 
 */
public interface productoRepositorio extends JpaRepository<Producto, Integer>{
    
}
