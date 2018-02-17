package com.soma.controlveicular;

/**
 * Created by SOMA-ULISES on 15/02/2018.
 */

public class Administrativo  extends Automovilista{

    private int nnumeroAdministrativo;

    public Administrativo(int idAutomilista, String nombre, String apellidoP, String apellidoM, String correoElectronico, int numeroTarjetaEstacionamiento, int telefonoCelular, int telefonoDepartamento, String licencia, String tarjetaCirculacion) {
        super(idAutomilista, nombre, apellidoP, apellidoM, correoElectronico, numeroTarjetaEstacionamiento, telefonoCelular, telefonoDepartamento, licencia, tarjetaCirculacion);
    }
}
