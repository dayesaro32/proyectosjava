import com.sena.BusinessVehiculo;
import com.sena.Vehiculo;
import utils.Conexion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BusinessVehiculo business= new BusinessVehiculo();
        Vehiculo v= new Vehiculo();
        String placan= JOptionPane.showInputDialog( null, "Ingrese una Placa");
        v.setPlaca(placan);
        String modelon=JOptionPane.showInputDialog(null,"Ingrese el Modelo del Vehiculo"+" "+placan);
        v.setModelo(modelon);
        String chasisn=JOptionPane.showInputDialog(null, "Ingrese el Chasis del Vehiculo"+" "+placan);
        v.setChasis("hyiolloodbud");
        String colorn=JOptionPane.showInputDialog(null, "Ingrese el Color del Vehiculo"+" "+placan);
        v.setColor(colorn);
        String marcan=JOptionPane.showInputDialog(null, "Ingrese la Marca del Vehiculo"+" "+placan);
        v.setMarca(marcan);
        business.registrarVehiculo(v);
        //String placa= JOptionPane.showInputDialog( null, "Ingrese una Placa a Eliminar");
        //business.eliminarVehiculo(placa);
        String placac= JOptionPane.showInputDialog( null, "Ingrese una Placa");
        business.consultarVehiculo(placac);



       /* Vehiculo v=new Vehiculo();
        Vehiculo v2= new Vehiculo("SDR83y", "2000", "Juan");
        String placa= JOptionPane.showInputDialog( null, "Ingrese una Placa");
        String color= JOptionPane.showInputDialog( null, "Ingrese Color del Vehiculo");
        String modelo= JOptionPane.showInputDialog( null, "Ingrese modelo del Vehiculo");
        String propietario= JOptionPane.showInputDialog( null, "Ingrese Propietario del Vehiculo");
        String chasis= JOptionPane.showInputDialog( null, "Ingrese numero del Chasis del Vehiculo");
        v.asignarPlaca(placa);
        v.asignarColor(color);
        v.asignarModelo(modelo);
        v.asignarPropietario(propietario);
        v.asignarChasis(chasis);
        System.out.println(v.obtenerPlaca());
        System.out.println(v.obtenerColor());
        System.out.println(v.obtenerModelo());
        System.out.println(v.obtenerPropietario());
        System.out.println(v.obtenerChasis());*/
    }

}