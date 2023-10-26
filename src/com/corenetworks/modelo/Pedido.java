package com.corenetworks.modelo;

public class Pedido {
    //Atributos
    private int pedido;
    private double importe;
    private char formaPago;
//Métodos
public double calcularIva(double porcentaje) {
    return importe * porcentaje;
}
public String mostrarInfo() {
    return "id pedido: " + pedido +
            " Importe: " + importe +
            " Forma de pago: " + formaPago;
}
//Setters
    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public void setImporte(double importe ) {
        this.importe= importe;
    }

    public void setFormaPago(char formaPago) {
        this.formaPago=formaPago;
    }

    //Getters
    public int getPedido() {
        return pedido;
    }

    public double getImporte() {
        return importe;
    }

    public char getFormaPago() {
        return formaPago;
    }



    }

