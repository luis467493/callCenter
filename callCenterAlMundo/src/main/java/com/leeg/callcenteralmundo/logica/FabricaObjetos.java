package com.leeg.callcenteralmundo.logica;

import com.leeg.callcenteralmundo.modelo.Director;
import com.leeg.callcenteralmundo.modelo.LlamadaTelefonica;
import com.leeg.callcenteralmundo.modelo.Operador;
import com.leeg.callcenteralmundo.modelo.Supervisor;

public class FabricaObjetos {

    private FabricaObjetos() {
    }
    
    public static Operador crearOperador(){
        return new Operador();
    }
    
    public static Supervisor crearSupervisor(){
        return new Supervisor();
    }
    
    public static Director crearDirector(){
        return new Director();
    }
    
    public static LlamadaTelefonica crearLlamadaTelefonica(){
        return new LlamadaTelefonica();
    }
    
    public static Dispatcher crearDispatcher(){
        return new Dispatcher();
    }
    
}
