package com.corenetworks.presentacion;

import com.corenetworks.modelo.Proveedores;

public class PruebaProveedores {
    public static void main(String[] args) {
        Proveedores pr1 =new Proveedores();
        pr1.setIdProveedor(15);
        pr1.setNombre("Vicente Carter");
        pr1.setTelefono("622238275");
        pr1.setCantidadEmpleados(54);
        System.out.println("Id del proveedor: "+ pr1.getIpProveedor());
        System.out.println("Nombre del proveedor: "+ pr1.getNombre());
        System.out.println("Nº de Télefono: "+ pr1.getTelefono());
        System.out.println("Nº de empleados: "+ pr1.getCantidadEmpleados());

    }

    }

