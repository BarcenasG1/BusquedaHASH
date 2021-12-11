package Modelo;
import Modelo.HashTab;
import java.util.Scanner;
/**
 * @author GhostBarcenas
 */
public class HashTabDemo {

    public static void main(String[] args) {

        // número de identificación
        int id = 1;

        // Crear una tabla hash
        HashTab hashTab = new HashTab(7);
        String key = "";
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("add: add del: delete list: show find: find exit: exit");
            key = input.next();
            switch (key) {
                case "add":
                    System.out.print("Ingrese nombre:");
                    String name = input.next();
                    // Crear empleado
                    datos valores = new datos(id++, name);
                    hashTab.add(valores);
                    break;
                case "del":
                    System.out.println("Introducir clave");
                    hashTab.deleteByID(input.nextInt());
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("Introducir clave");
                    hashTab.finddatsById(input.nextInt());
                    break;
                case "exit":
                    input.close();
                    System.exit(0);
                    break;
                default:
                    input.close();
                    System.exit(0);
                    break;
            }
        }
    }

}
