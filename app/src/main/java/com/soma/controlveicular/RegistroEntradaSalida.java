package com.soma.controlveicular;

import java.util.Date;

/**
 * Created by SOMA-ULISES on 15/02/2018.
 */

public class RegistroEntradaSalida {

    private int idRegistro;
    private int numeroTarjetaEstacionamiento;
    private Date fechaEntrada;
    private Date fechaSalida;

    public RegistroEntradaSalida(int idRegistro, int numeroTarjetaEstacionamiento, Date fechaEntrada, Date fechaSalida) {
        this.idRegistro = idRegistro;
        this.numeroTarjetaEstacionamiento = numeroTarjetaEstacionamiento;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public int getNumeroTarjetaEstacionamiento() {
        return numeroTarjetaEstacionamiento;
    }

    public void setNumeroTarjetaEstacionamiento(int numeroTarjetaEstacionamiento) {
        this.numeroTarjetaEstacionamiento = numeroTarjetaEstacionamiento;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
