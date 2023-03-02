package com.sena;

public class Vehiculo {
    String placa;
    String color;
    String modelo;

    String marca;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
}