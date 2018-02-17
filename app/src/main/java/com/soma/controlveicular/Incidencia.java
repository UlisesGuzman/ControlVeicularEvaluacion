package com.soma.controlveicular;

import java.util.Date;

/**
 * Created by SOMA-ULISES on 15/02/2018.
 */

public class Incidencia  {

     private int idIncidencia;
     private int idAutomilista;
     private Date fecha;
     private String descripcion;
     private int idGuardia;

    public Incidencia(int idIncidencia, int idAutomilista, Date fecha, String descripcion, int idGuardia) {
        this.idIncidencia = idIncidencia;
        this.idAutomilista = idAutomilista;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.idGuardia = idGuardia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
