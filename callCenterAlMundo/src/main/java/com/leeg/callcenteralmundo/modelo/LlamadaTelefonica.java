package com.leeg.callcenteralmundo.modelo;

import com.leeg.callcenteralmundo.logica.Dispatcher;
import com.leeg.callcenteralmundo.logica.LogicaGeneral;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class LlamadaTelefonica extends Thread{
    
    private Dispatcher dispatcher = new Dispatcher();
    private List<Empleado> empleados;

    private String idLlamada;
    private Date fechaHoraInicio;
    private Empleado contestador;
    private Boolean enEspera = true;
    private Boolean respondida = false;
    private Boolean finalizada = false;
    private final Integer rangoMinimoDuracionLlamada = 5;
    private final Integer rangoMaximoDuracionLlamada = 10;

    public LlamadaTelefonica() {
        fechaHoraInicio = new Date();
    }
    
    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        System.out.println( getIdLlamada() + " iniciada " + calendar.getTime());
        int aleatorio = LogicaGeneral.generarAleatorio(rangoMinimoDuracionLlamada, rangoMaximoDuracionLlamada);
        
        calendar.add(Calendar.SECOND, aleatorio);
        Date fin = calendar.getTime();
        
        Date temporal = new Date();
        
        Integer contadorFinal = 0;
        Integer contadorEspera = 0;
        
        while (temporal.before(fin)) {
            dispatcher.dispatchCall(this);
            temporal = new Date();
            
            if (contestador!= null && contadorFinal <= 1) {
                Calendar calendarFin = Calendar.getInstance();
                calendarFin.add(Calendar.SECOND, aleatorio);
                fin = calendarFin.getTime();
                contadorFinal++;
            }
            
            if (contestador == null && contadorEspera <= 1) {
                System.out.println( getIdLlamada()+ " en espera!");
                contadorEspera++;
            }        
        }
        
        setRespondida(false);
        setEnEspera(false);
        setFinalizada(true);
        if (contestador!= null) {
            contestador.setAsignado(false);
            System.out.println("Empleado " + contestador.getNombre() + " esta disponible!");
        }
        
        System.out.println( getIdLlamada() + " finalizada " + new Date());
    }    

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setContestador(Empleado contestador) {
        this.contestador = contestador;
    }

    public Empleado getContestador() {
        return contestador;
    }

    public Boolean getRespondida() {
        return respondida;
    }

    public void setRespondida(Boolean respondida) {
        this.respondida = respondida;
    }

    public Boolean getEnEspera() {
        return enEspera;
    }

    public void setEnEspera(Boolean enEspera) {
        this.enEspera = enEspera;
    }

    public String getIdLlamada() {
        return idLlamada;
    }

    public void setIdLlamada(String idLlamada) {
        this.idLlamada = idLlamada;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }
    
}
