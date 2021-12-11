package Modelo;
import javax.swing.JOptionPane;
/**
 * @author GhostBarcenas
 */
public class TestHash {

    public static void main(String[] args) {
        TablaHash hash = new TablaHash(8);
        String datos = "99 91 53 20 89 12 97 36"; //Prueba 1
        String []elementos = datos.split(" "); //Prueba 1
        
        //String[]elementos = new String[8];
        //generaValores(elementos);
        System.out.println("Elementos= " + hash);
        
        hash.funcionHash(elementos);
        hash.mostrar();
        String clave;
        do{
            clave = JOptionPane.showInputDialog("Clave a buscar: ");
            String salida = hash.BuscarClave(clave);
            System.out.println(salida);            
        }while(clave.charAt(0) != '0');
    }
    public static void generaValores(String [] elementos){
        for(int i = 0; i<8; i++){
            elementos[i]=""+(int)(Math.random()*100+1);
        }
        for(String e: elementos){
            System.out.println("" + e);
        }
        System.out.println();
    }
}
