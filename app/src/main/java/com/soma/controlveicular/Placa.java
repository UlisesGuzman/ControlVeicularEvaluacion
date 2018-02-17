package com.soma.controlveicular;

/**
 * Created by SOMA-ULISES on 15/02/2018.
 */

public class Placa {

    private int idPlaca;
    private String numeroPlaca;
    private String estadoRepublica;
    private String placa;

    public Placa(int idPlaca, String numeroPlaca, String estadoRepublica, String placa) {
        this.idPlaca = idPlaca;
        this.numeroPlaca = numeroPlaca;
        this.estadoRepublica = estadoRepublica;
        this.placa = placa;
    }

    public int getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(int idPlaca) {
        this.idPlaca = idPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getEstadoRepublica() {
        return estadoRepublica;
    }

    public void setEstadoRepublica(String estadoRepublica) {
        this.estadoRepublica = estadoRepublica;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
