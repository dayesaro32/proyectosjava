import com.sena.Vehiculo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo v=new Vehiculo();
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
        System.out.println(v.obtenerChasis());
    }

}