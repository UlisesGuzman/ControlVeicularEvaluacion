package com.soma.controlveicular;

import java.util.Date;

/**
 * Created by SOMA-ULISES on 15/02/2018.
 */

public class Guardia {

    private int IdGuardia;
    private String nombre;
    private String apellidoP;
    private String apellidoM;

    public Guardia(int idGuardia, String nombre, String apellidoP, String apellidoM) {
        IdGuardia = idGuardia;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }

    private  void buscarPropetario(int numTarjeta ){

    }

    private  void reportarNumeroIncidencia (Date fechaEntrada, Date fechaSalida ){

    }

    private  void consultarNumeroVehiculos (){

    }

    private  void registrarAutomovil (String nombre, String apellidoP, String apellidoM,
     String correoEllectronico, String placa, String marca, String color, String modelo,
                                      String licenciaConducir, String tarjetaCirculacion,
                                      int telefonoCelular, int telefonoDepartamento, int numeroEstudiante){

    }

    public int getIdGuardia() {
        return IdGuardia;
    }

    public void setIdGuardia(int idGuardia) {
        IdGuardia = idGuardia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
}
