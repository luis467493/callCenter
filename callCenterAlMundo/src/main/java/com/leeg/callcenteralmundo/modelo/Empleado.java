package com.leeg.callcenteralmundo.modelo;

public class Empleado {
    
    private String nombre;
    private Boolean asignado = false;

    public Empleado() {
    }

    public Empleado(String nombre, Integer instanciaTelefonica) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAsignado() {
        return asignado;
    }

    public void setAsignado(Boolean asignado) {
        this.asignado = asignado;
    }
}
