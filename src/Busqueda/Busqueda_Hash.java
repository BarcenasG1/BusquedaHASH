package Busqueda;

import Datos.Autos;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Busqueda_Hash {

    Autos[] arreglo;
    int tamaño, contador;
    String info="";
    
    
   

    public Busqueda_Hash(int tam) {

        tamaño = tam;
        arreglo = new Autos[tam];

        for (int i = 0; i < tam; i++) {
            Autos b = new Autos();

            b.SetVIN(-1);
            b.SetModel("-1");
            b.SetColor("-1");

            arreglo[i] = b;

        }

    }
    
  

    public void funcionHash(Autos[] cadenaArreglo) { //$155 y $30

        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            Autos b = new Autos();
            int elemento = cadenaArreglo[i].getVIN();
            int indiceArreglo = elemento % (tamaño - 1);
            
            info = info +"\nEl indice es: " + indiceArreglo + " Para el elemento " + elemento;
         
            //System.out.println("El indice es: " + indiceArreglo + " Para el elemento " + elemento);
            //Tratamiento de colisiones
            while (arreglo[indiceArreglo].getVIN() != -1) {
                indiceArreglo++;

                
                info =  info + "\nOcurrio una colision en el indice " + (indiceArreglo - 1) + " Cambiar al indice " + indiceArreglo
                        +"\nEl indice es: " + indiceArreglo + " Para el elemento " + elemento;
          
                
               // System.out.println("Ocurrio una colision en el indice " + (indiceArreglo - 1) + " Cambiar al indice " + indiceArreglo);
                indiceArreglo %= tamaño;
            }
            b.SetVIN(elemento);
            b.SetModel(cadenaArreglo[i].getModel());
            b.SetColor(cadenaArreglo[i].getColor());
            arreglo[indiceArreglo] = b;
        }
    }
    
    
    public String data(){

        return info;
  
    }
    
       public Autos[] arr(){

        return arreglo;
  
    }
    
    

    public int BuscarClave(int elemento) {
        int elemen = elemento;
        int indiceArreglo = elemento % (tamaño - 1);
        contador = 0;
        while (arreglo[indiceArreglo].getVIN() != -1) {
            if (arreglo[indiceArreglo].getVIN() == elemen) {
                System.out.println("El elemento " + elemento + " Fue encontrado en el indice " + indiceArreglo);
                return indiceArreglo;
            }
            indiceArreglo++;
            indiceArreglo %= tamaño;
            contador++;
            if (contador > (tamaño - 1)) {
                break;
            }
        }
        //JOptionPane.showMessageDialog(null,"no se entro el elemento");
        return -1;
    }

    public void eliminarHash(int i) {

        Autos b = new Autos();
        b.SetVIN(-1);
        b.SetModel("-1");
        b.SetColor("-1");

        arreglo[i] = b;

    }

    public String mostrar() {

        String dt="\n Index  \t  VIN  \t  Model  \t Color  \n";
        
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i].getVIN() == -1) {
                dt =dt + "";
                
                
            } else {
                dt = dt+"\n [" + i + "] ---> \t" + arreglo[i].getVIN() + "\t" + arreglo[i].getModel() + "\t" + arreglo[i].getColor()+"\n";
            }

        }
        return dt;
    }

}

