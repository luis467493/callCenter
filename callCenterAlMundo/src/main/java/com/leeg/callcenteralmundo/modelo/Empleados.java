package com.leeg.callcenteralmundo.modelo;

import com.leeg.callcenteralmundo.logica.FabricaObjetos;
import java.util.ArrayList;
import java.util.List;

public class Empleados {
    
    public static List<Empleado> empleados = new ArrayList<>();

    public static void llenarEmpleados() {
        
        Operador operador = FabricaObjetos.crearOperador();
        operador.setNombre("Pepito Perez");
        operador.setAsignado(false);
        empleados.add(operador);
        
        Supervisor supervisor = FabricaObjetos.crearSupervisor();
        supervisor.setNombre("Juan Pigna");
        supervisor.setAsignado(false);
        empleados.add(supervisor);
        
        Director director = FabricaObjetos.crearDirector();
        director.setNombre("Tropi cana");
        director.setAsignado(false);
        empleados.add(director);
        
        operador = FabricaObjetos.crearOperador();
        operador.setNombre("Armando Casas");
        operador.setAsignado(false);
        empleados.add(operador);
        
        director = FabricaObjetos.crearDirector();
        director.setNombre("Andrea Juanpi");
        director.setAsignado(false);
        empleados.add(director);
        
        supervisor = FabricaObjetos.crearSupervisor();
        supervisor.setNombre("Ame Las");
        supervisor.setAsignado(false);
        empleados.add(supervisor);
        
        operador = FabricaObjetos.crearOperador();
        operador.setNombre("Elver Gomez");
        operador.setAsignado(false);
        empleados.add(operador);
        
        supervisor = FabricaObjetos.crearSupervisor();
        supervisor.setNombre("Aran Danos");
        supervisor.setAsignado(false);
        empleados.add(supervisor);
        
        director = FabricaObjetos.crearDirector();
        director.setNombre("Esteban quito");
        director.setAsignado(false);
        empleados.add(director);
        
        director = FabricaObjetos.crearDirector();
        director.setNombre("Popo San");
        director.setAsignado(false);
        empleados.add(director);
        
    }

}
