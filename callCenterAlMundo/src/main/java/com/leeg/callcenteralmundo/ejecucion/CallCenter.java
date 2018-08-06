package com.leeg.callcenteralmundo.ejecucion;

import com.leeg.callcenteralmundo.modelo.Empleados;
import com.leeg.callcenteralmundo.modelo.LlamadaTelefonica;

public class CallCenter {

    public static void main(String[] args) throws InterruptedException {

        Empleados.llenarEmpleados();
        Integer maxLlamadasGeneradas = 13;
        LlamadaTelefonica llamadaTelefonica;

        for (int indice = 1; indice <= maxLlamadasGeneradas; indice++) {
            llamadaTelefonica = new LlamadaTelefonica();
            llamadaTelefonica.setIdLlamada("Llamada " + indice);
            llamadaTelefonica.setEmpleados(Empleados.EMPLEADOS);
            llamadaTelefonica.start();
            Thread.sleep(200L);
        }

    }

}
