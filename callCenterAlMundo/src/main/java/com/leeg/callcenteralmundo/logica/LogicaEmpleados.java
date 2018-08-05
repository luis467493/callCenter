package com.leeg.callcenteralmundo.logica;

import com.leeg.callcenteralmundo.modelo.Empleados;

public class LogicaEmpleados<T> {
    
    public T encontrarSiguienteEmpleadoDisponible(T t) {
        return (T) Empleados.empleados.stream().filter( 
            (empleado) -> {
                return empleado!=null &&  false == empleado.getAsignado() && empleado.getClass().isInstance(t);
            }
            
        ).findFirst().orElse(null);
    }    
    
}
