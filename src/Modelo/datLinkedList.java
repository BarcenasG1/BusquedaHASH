package Modelo;
/**
 * @author GhostBarcenas
 */
public class datLinkedList {
    //Encabezado de la lista de enlaces
    private datos head;
    
    //Eliminar
    public void deletedatosById(int id){
        if(head == null){
            return;
        }
        datos temp = head;
        
        while(true){
            if(temp.id == id){
                //Eliminar
                head = temp.next;
                break;
            }
            if(temp.next == null){
                break;
            }
            if(temp.next.id == id){
                //Eliminar el nodo datos
                temp.next = temp.next.next;
                break;
            }
            //Hacia atras
            temp = temp.next;
        }
    }
    
    //Metodo encontrar
    public datos finddatosById(int id){
        if(head == null){
            return null;
        }
        datos temp = head;
        while(true){
            if(temp.id == id){
                break;
            }
            if(temp.next == null){
                temp = null;
                break;
            }
            //Hacia atrás
            temp = temp.next;
        }
        return temp;
    }
    
    //Metodo atravesar
    public void list(int no){
        if(head == null){
            System.out.println("Sección" + (no + 1) + "La lista vinculada está vacía");
            return;
        }
        System.out.print("Sección" + (no + 1) + "Información de la lista vinculada para");
        datos temp = head;
        
        while(true){
            System.out.print(temp + " --> ");
            if(temp.next == null){
                break;
            }
            //Hacia atrás
            temp = temp.next;
        }
        System.out.println();
    }
    
    //Metodo de agregar datos
    public void addDatos(datos dat){
        if(head == null){
            head = dat;
            return;
        }
        datos temp = head;
        while(temp.next != null){
            //Hacia atrás
            temp = temp.next;
        }
        temp.next = dat;
    }
}
