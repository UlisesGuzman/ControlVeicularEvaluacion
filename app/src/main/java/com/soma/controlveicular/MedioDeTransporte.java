package com.soma.controlveicular;

/**
 * Created by SOMA-ULISES on 15/02/2018.
 */

public class MedioDeTransporte {

    private int idTransporte;
    private String marca;
    private String color;
    private String modelo;
    private int tipoTransporte;
    private String caracteristicasEspecificas;

    public MedioDeTransporte(int idTransporte, String marca, String color, String modelo, int tipoTransporte, String caracteristicasEspecificas) {
        this.idTransporte = idTransporte;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tipoTransporte = tipoTransporte;
        this.caracteristicasEspecificas = caracteristicasEspecificas;
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(int tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getCaracteristicasEspecificas() {
        return caracteristicasEspecificas;
    }

    public void setCaracteristicasEspecificas(String caracteristicasEspecificas) {
        this.caracteristicasEspecificas = caracteristicasEspecificas;
    }
}
