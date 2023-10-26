package com.corenetworks.modelo;

public class Producto {
    //Atributos
    private int idProducto;
    private String nombre;
    private int cantidaddeexistencias;
    //Setters
    public void setIdProducto(int valor){
        idProducto = valor;
    }
    public void setNombre(String nombre){//Raton gris llega a este nombre
        //this para dar atributo
        this.nombre =nombre;
    }
    public void setCantidadExistencias(int cantidadExistencias){
        this.cantidaddeexistencias = cantidadExistencias;
    }
    //Getters
    //modo de acceso
    public  int getIdProducto(){
        return idProducto;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidadExistencias(){
        return cantidaddeexistencias;
    }
}
