package com.corenetworks.modelo;

public class Mensaje {
    //atributos
    private String saludo;
    private String ipOrigen;
    private String ipDestino;
    //métodos
    public int calcularNumeroPalabras(){
        String[] palabras = saludo.split(" ");
        return palabras.length;
    }
    public String mostrarInfo(){

        return "saludo: "+saludo+
                " Ip de origen: "+ ipOrigen +
                " Ip de destino: "+ ipDestino;
    }
    //setters

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getIpOrigen() {
        return ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }
    //getters

    public String getSaludo() {
        return saludo;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }


    }

