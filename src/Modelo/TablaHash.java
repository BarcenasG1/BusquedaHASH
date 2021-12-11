package Modelo;

import java.util.Arrays;

/**
 * @author GhostBarcenas
 */
public class TablaHash {

    String[] arreglo;
    int tamaño, contador;

    public TablaHash(int tam) {
        tamaño = tam;
        arreglo = new String[tam];
        Arrays.fill(arreglo, "-1");
    }

    public void funcionHash(String[] cadenaArreglo) { //$155 y $30
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento) % (tamaño - 1);
            System.out.println("El indice es: " + indiceArreglo + " Para el elemento " + elemento);
            //Tratamiento de colisiones
            while (Integer.parseInt(arreglo[indiceArreglo]) != -1) {
                indiceArreglo++;
                System.out.println("Ocurrio una colision en el indice " + (indiceArreglo - 1) + " Cambiar al indice " + indiceArreglo);
                indiceArreglo %= tamaño;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }

    public void Datos() {
        String[][] datos = new String[6][6];
        int f=0,c=0;
        for (f = 0; f < datos.length; f++) {
            
            for (c = 0; c < datos.length; c++) {
                
            }
        }
    }

    public String BuscarClave(String elemento) {
        int indiceArreglo = Integer.parseInt(elemento) % (tamaño - 1);
        contador = 0;
        while (Integer.parseInt(arreglo[indiceArreglo]) != -1) {
            if (arreglo[indiceArreglo].equals(elemento)) {
                System.out.println("El elemento " + elemento + " Fue encontrado en el indice " + indiceArreglo);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo %= tamaño;
            contador++;
            if (contador > (tamaño - 1)) {
                break;
            }
        }
        return "La clave " + elemento + " No fue encontrada";
    }
    public void eliminarHash(String elemento){
        
    }
    public void mostrar() {
        int incremento = 0, i, j;
        for (i = 0; i < 1; i++) {
            incremento += 8;
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                System.out.format("| %3s" + " ", j);
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                if (arreglo[j].equals("-1")) {
                    System.out.print("|   ");
                } else {
                    System.out.print(String.format("| %3s" + " ", arreglo[j]));
                }
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
