package com.soma.controlveicular;

/**
 * Created by SOMA-ULISES on 15/02/2018.
 */

public class Automovilista  {

    private int idAutomilista;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String correoElectronico;
    private int numeroTarjetaEstacionamiento;
    private int telefonoCelular;
    private int telefonoDepartamento;
    private String licencia;
    private String tarjetaCirculacion;

    public Automovilista(int idAutomilista, String nombre, String apellidoP, String apellidoM, String correoElectronico, int numeroTarjetaEstacionamiento, int telefonoCelular, int telefonoDepartamento, String licencia, String tarjetaCirculacion) {
        this.idAutomilista = idAutomilista;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correoElectronico = correoElectronico;
        this.numeroTarjetaEstacionamiento = numeroTarjetaEstacionamiento;
        this.telefonoCelular = telefonoCelular;
        this.telefonoDepartamento = telefonoDepartamento;
        this.licencia = licencia;
        this.tarjetaCirculacion = tarjetaCirculacion;
    }

    public int getIdAutomilista() {
        return idAutomilista;
    }

    public void setIdAutomilista(int idAutomilista) {
        this.idAutomilista = idAutomilista;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getNumeroTarjetaEstacionamiento() {
        return numeroTarjetaEstacionamiento;
    }

    public void setNumeroTarjetaEstacionamiento(int numeroTarjetaEstacionamiento) {
        this.numeroTarjetaEstacionamiento = numeroTarjetaEstacionamiento;
    }

    public int getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(int telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public int getTelefonoDepartamento() {
        return telefonoDepartamento;
    }

    public void setTelefonoDepartamento(int telefonoDepartamento) {
        this.telefonoDepartamento = telefonoDepartamento;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getTarjetaCirculacion() {
        return tarjetaCirculacion;
    }

    public void setTarjetaCirculacion(String tarjetaCirculacion) {
        this.tarjetaCirculacion = tarjetaCirculacion;
    }
}
