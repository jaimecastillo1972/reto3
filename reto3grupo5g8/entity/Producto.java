/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.sa.practica.reto3grupo5g8.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 *
 * @author Jaime Alonso Castillo
 * Escrito 6 de octubre de 2021
 * clase de mapeo de tabla producto
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private double precio;
    private int inventario;
    
    
}
