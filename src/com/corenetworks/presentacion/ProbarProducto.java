package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class ProbarProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.setIdProducto(5);//p1.idProducto =5
        p1.setNombre("Ratón Gris");
        p1.setCantidadExistencias(100);
        System.out.println("Id: " + p1.getIdProducto());
        System.out.println("Nombre: "+ p1.getNombre());
        System.out.println("Cantidad de existencias: "+ p1.getCantidadExistencias());
    }
}
