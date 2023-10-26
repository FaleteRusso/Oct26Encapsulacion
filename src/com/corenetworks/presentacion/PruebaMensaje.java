package com.corenetworks.presentacion;

import com.corenetworks.modelo.Mensaje;

import java.util.Scanner;

public class PruebaMensaje {
    public static void main(String[] args) {
        Mensaje m1=new Mensaje();
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca su mensaje:");
        m1.setSaludo(teclado.nextLine());
        System.out.println("introduzca su Ip:");
        m1.setIpOrigen(teclado.nextLine());
        System.out.println("introduzca la Ip del destinatario:");
        m1.setIpDestino(teclado.nextLine());
        System.out.println(m1.mostrarInfo());
        int numeroDePalabras = m1.calcularNumeroPalabras();
        System.out.println("Número de palabras en la oración: " + numeroDePalabras);

    }
}
