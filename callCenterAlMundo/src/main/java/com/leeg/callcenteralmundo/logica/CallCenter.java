package com.leeg.callcenteralmundo.logica;

import com.leeg.callcenteralmundo.modelo.Empleados;
import com.leeg.callcenteralmundo.modelo.LlamadaTelefonica;

public class CallCenter {

    public static void main(String[] args) throws InterruptedException {

        Empleados.llenarEmpleados();
        Integer maxLlamadasGeneradas = 13;
        LlamadaTelefonica llamadaTelefonica = null;

        for (int indice = 1; indice <= maxLlamadasGeneradas; indice++) {
            llamadaTelefonica = FabricaObjetos.crearLlamadaTelefonica();
            llamadaTelefonica.setIdLlamada("Llamada " + indice);
            llamadaTelefonica.setEmpleados(Empleados.empleados);
            llamadaTelefonica.start();
            Thread.sleep(200L);
        }

        llamadaTelefonica = null;
        maxLlamadasGeneradas = null;

    }

}
