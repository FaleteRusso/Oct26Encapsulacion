package com.corenetworks.modelo;

public class Proveedores {
    //Atributos
    private int ipProveedor;
    private String nombre;
    private String telefono;
    private int cantidadEmpleados;
    //Setters
    public void setIdProveedor(int num){
     this.ipProveedor = num;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(String numerotelefono){
        this.telefono=numerotelefono;
    }
    public void setCantidadEmpleados(int cantidadEmpleados){
        this.cantidadEmpleados = cantidadEmpleados;
    }
    //Getters
    public int getIpProveedor(){
        return  ipProveedor;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public int getCantidadEmpleados(){
        return cantidadEmpleados;
    }

}
