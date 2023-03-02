package com.sena;

import utils.Conexion;

import java.sql.*;

public class BusinessVehiculo
{
public void registrarVehiculo(Vehiculo v)
        //Conectar a una base de datos
{
    Conexion conexion = new Conexion();
    Connection con=conexion.getConnection();
    String sql="INSERT INTO VEHICULO VALUES(null,'"+v.getPlaca()+"','"+v.getModelo()+"','"+v.getMarca()+"','"+v.getChasis()+"')";
    try {
        Statement p= con.prepareStatement(sql);
        p.execute(sql);
    } catch (SQLException e) {
        System.out.println(e);//Mostramos todo el Error
       // throw new RuntimeException(e);
    }
}
    public String consultarVehiculo (String placa)
    {
        try {
            Conexion conexion= new Conexion();
            Connection con= conexion.getConnection();
            String sql = "SELECT * FROM VEHICULO WHERE PLACA="+placa+"'";
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet resultado= ps.executeQuery();
            while(resultado.next())
            {
                Vehiculo v= new Vehiculo();
                String modelo=resultado.getString("modelo");
                //System.out.println(resultado.getString("marca"));
                System.out.println(resultado.getString(1));
                v.setModelo(modelo);
            }
        }
        catch (SQLException e)
        {

        }
        return null;
    }

    public void eliminarVehiculo(String placa)
    //Conectar a una base de datos
    {
        Conexion conexion = new Conexion();
        Connection con=conexion.getConnection();
        String sql="delete from vehiculo where placa='"+placa+"'";
        try {
            Statement p= con.prepareStatement(sql);
            p.execute(sql);
        } catch (SQLException e) {
            System.out.println(e);//Mostramos todo el Error
            // throw new RuntimeException(e);
        }
    }
public void traspaso(String Placa, String nombre)
{

}
public void cambiarColor(String placa, String nuevoColor)
{

}
}
