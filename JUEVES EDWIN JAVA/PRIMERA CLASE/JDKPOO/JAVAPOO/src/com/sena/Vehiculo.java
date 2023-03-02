package com.sena;

public class Vehiculo {
    String placa;
    String color;
    String modelo;
    String propietario;
    String chasis;

    //variables Globales

    public Vehiculo()
    {

    }
    public Vehiculo(String placa, String modelo, String propietario)
    {
        this.placa=placa;
        this.modelo=modelo;
        this.propietario=propietario;
    }
    public void matricularVehiculo() {

    }

    public void asignarPlaca(String PlacaL)//Variable Local
    {
        this.placa = PlacaL;
    }

    public String obtenerPlaca() {
        return this.placa;
    }

    public void asignarColor(String ColorL)//Variable Local
    {
        this.color = ColorL;
    }

    public String obtenerColor() {
        return this.color;
    }

    public void asignarModelo(String ModeloL)//Variable Local
    {
        this.modelo = ModeloL;
    }

    public String obtenerModelo() {
        return this.modelo;
    }

    public void asignarPropietario(String PropietarioL)//Variable Local
    {
        this.propietario = PropietarioL;
    }

    public String obtenerPropietario() {
        return this.propietario;
    }


    public void asignarChasis(String ChasisL)//Variable Local
    {
        this.chasis = ChasisL;
    }

    public String obtenerChasis() {
        return this.chasis;
    }

}