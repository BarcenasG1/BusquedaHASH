package Programa;

import Busqueda.Busqueda_Hash;
import Datos.Autos;
import javax.swing.JOptionPane;

public class prueba {

    public static void main(String[] args) {

        Busqueda_Hash a = new Busqueda_Hash(4);

        Autos elm[] = new Autos[4];

        for (int i = 0; i < elm.length; i++) {
            Autos b = new Autos();
            b.SetVIN(Integer.parseInt(JOptionPane.showInputDialog("dame vin:")));
            b.SetModel(JOptionPane.showInputDialog("dame model:"));
            b.SetColor(JOptionPane.showInputDialog("dame color:"));

            elm[i] = b;
        }

        a.funcionHash(elm);

        int key = Integer.parseInt(JOptionPane.showInputDialog("Dame key"));

        a.mostrar();

        int Salida = a.BuscarClave(key);

        int opc = Integer.parseInt(JOptionPane.showInputDialog("eliminar ?" + Salida));

        if (opc == 0) {
            a.eliminarHash(Salida);
        } else {

        }

        a.mostrar();

    }

}
