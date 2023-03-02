package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion
{
    private String username="root";
    private String passsword="";
    private String hostname="localhost";
    private String port="3306";
    private String database="transitomedellin";
    private String classname="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://"+hostname+":"+port+""+"/"+database;
    private Connection conn;
    public Conexion()
    {
        try
        {
          //  Class.forName(classname);
            conn= DriverManager.getConnection(url, username, passsword);
            System.out.println("Conexion OK");
        }
        catch (Exception e)
        {
           // System.err.println(e.getMessage());
            System.out.println(e);//Imprimir todo el error
        }
    }


//Agregado Automaticamente
    public Connection getConnection()
    {
        return conn;
    }
}
