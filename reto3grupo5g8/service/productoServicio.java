/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.sa.practica.reto3grupo5g8.service;

import com.reto3.sa.practica.reto3grupo5g8.entity.Producto;
import com.reto3.sa.practica.reto3grupo5g8.repository.productoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Don-Jaime
 */
@Service
public class productoServicio {
    @Autowired
    private productoRepositorio repository;
    
    /**C
     * Guardar productos
     * @return 
     */
    public Producto saveProducto(Producto producto){
        return repository.save(producto);
    }
    
    /**R
     * Mostrar producto
     * @return 
     */
    public List<Producto> getProductoAll(){
        return repository.findAll();
    }
    
    /**U
     * Actualizar productos
     */
    public Producto updateProducto(Producto producto){
        Producto existeProducto=repository.findById(producto.getId()).orElse(null);
        existeProducto.setNombre(producto.getNombre());
        existeProducto.setPrecio(producto.getPrecio());
        existeProducto.setInventario(producto.getInventario());
        return repository.save(existeProducto);
    }
    
    /**D
     * Borrar productos
     * @return 
     */
    public String deleteProducto(int id){
        repository.deleteById(id);
        return "Producto Removido"+id;
        
    }
}
