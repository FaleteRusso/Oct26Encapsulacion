package com.corenetworks.presentacion;

import com.corenetworks.modelo.Pedido;

import java.util.Scanner;

public class ProbarPedido {
    public static void main(String[] args) {
        Pedido p1=new Pedido();
        Scanner teclado=new Scanner(System.in);
//Solicitar datos( al usar setters, X=teclado.. no es valido
// pasa a dentro de parentesis
        System.out.println("Introduzca Nº de pedido:");
        p1.setPedido(teclado.nextInt());
        System.out.println("Introduzca importe:");
        p1.setImporte(teclado.nextDouble());
        System.out.println("Introduzca forma de pago:(t=tarjeta, p=paypal");
        p1.setFormaPago(teclado.next().charAt(0));


        System.out.println(p1.mostrarInfo());
        System.out.println("el iva es: "+p1.calcularIva(0.21));



    }
}
