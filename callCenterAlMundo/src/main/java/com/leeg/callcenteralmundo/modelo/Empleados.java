package com.leeg.callcenteralmundo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Empleados {
    
    public static final List<Empleado> EMPLEADOS = new ArrayList<>();

    public static void llenarEmpleados() {
        
        Operador operador = new Operador();
        operador.setNombre("Pepito Perez");
        operador.setAsignado(false);
        EMPLEADOS.add(operador);
        
        Supervisor supervisor = new Supervisor();
        supervisor.setNombre("Juan Pigna");
        supervisor.setAsignado(false);
        EMPLEADOS.add(supervisor);
        
        Director director = new Director();
        director.setNombre("Tropi cana");
        director.setAsignado(false);
        EMPLEADOS.add(director);
        
        operador = new Operador();
        operador.setNombre("Armando Casas");
        operador.setAsignado(false);
        EMPLEADOS.add(operador);
        
        director = new Director();
        director.setNombre("Andrea Juanpi");
        director.setAsignado(false);
        EMPLEADOS.add(director);
        
        supervisor = new Supervisor();
        supervisor.setNombre("Ame Las");
        supervisor.setAsignado(false);
        EMPLEADOS.add(supervisor);
        
        operador = new Operador();
        operador.setNombre("Elver Gomez");
        operador.setAsignado(false);
        EMPLEADOS.add(operador);
        
        supervisor = new Supervisor();
        supervisor.setNombre("Aran Danos");
        supervisor.setAsignado(false);
        EMPLEADOS.add(supervisor);
        
        director = new Director();
        director.setNombre("Esteban quito");
        director.setAsignado(false);
        EMPLEADOS.add(director);
        
        director = new Director();
        director.setNombre("Popo San");
        director.setAsignado(false);
        EMPLEADOS.add(director);
        
    }

}
