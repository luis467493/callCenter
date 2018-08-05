package com.leeg.callcenteralmundo.logica;

import com.leeg.callcenteralmundo.modelo.Director;
import com.leeg.callcenteralmundo.modelo.Empleado;
import com.leeg.callcenteralmundo.modelo.LlamadaTelefonica;
import com.leeg.callcenteralmundo.modelo.Operador;
import com.leeg.callcenteralmundo.modelo.Supervisor;

public class Dispatcher {

    public void dispatchCall(LlamadaTelefonica llamadaTelefonica) {
        
        LogicaEmpleados<Operador> logicaGeneralOperador = new LogicaEmpleados<>();
        LogicaEmpleados<Supervisor> logicaGeneralSupervisor = new LogicaEmpleados<>();
        LogicaEmpleados<Director> logicaGeneralDirector = new LogicaEmpleados<>();
        
        Empleado empleadoAsignado = logicaGeneralOperador.encontrarSiguienteEmpleadoDisponible(FabricaObjetos.crearOperador() );
        
        if (empleadoAsignado == null) {
            empleadoAsignado = logicaGeneralSupervisor.encontrarSiguienteEmpleadoDisponible(FabricaObjetos.crearSupervisor() );
            if (empleadoAsignado == null) {
                empleadoAsignado = logicaGeneralDirector.encontrarSiguienteEmpleadoDisponible(FabricaObjetos.crearDirector() );
            }
        }

        if (empleadoAsignado != null && llamadaTelefonica.getRespondida() == false) {
            empleadoAsignado.setAsignado(true);
            llamadaTelefonica.setRespondida(true);
            llamadaTelefonica.setEnEspera(false);
            llamadaTelefonica.setFinalizada(false);
            System.out.println( llamadaTelefonica.getIdLlamada() + " atendida por " + empleadoAsignado.getNombre());
            
            llamadaTelefonica.setContestador(empleadoAsignado);
        }

    }
    
}
