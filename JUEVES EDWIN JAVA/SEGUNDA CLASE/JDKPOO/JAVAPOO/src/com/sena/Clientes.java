package com.sena;

public class Clientes
{
    int documento;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    String correo;

    public Clientes()
    {

    }
    public Clientes (int documento, String nombres, String apellidos, String direccion, String telefono, String correo)
    {
        this.documento=documento;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;

    }
    public void setdocumento(int documento)
    {
        this.documento=documento;
    }
    public int getdocumento()
    {
        return this.documento;
    }
}

