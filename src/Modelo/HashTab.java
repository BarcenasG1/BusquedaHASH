package Modelo;
import Modelo.HashTabDemo;
/**
 * @author GhostBarcenas
 */
public class HashTab {
    //Matriz de lista vinculada
    private datLinkedList[] datLinkedListArray;
    private int size;
    
    //Constructoor
    public HashTab(int size){
        //Inicializar
        this.datLinkedListArray = new datLinkedList[size];
        this.size = size;
        //Necesita inicializar cada lista vinculada
        for(int i = 0; i < size; i++){
            datLinkedListArray[i] = new datLinkedList();
        }
    }
    
    //Eliminar informacion datos de la tabla hash de acuerdo a la identificación
    public void deleteByID(int id){
        int is = hashFun(id);
        datLinkedListArray[is].deletedatosById(id);
    }
    
    //Encuentra informacion datos de la tabla segun id
    public void finddatsById(int id){
        int is = hashFun(id);
        datos valores = datLinkedListArray[is].finddatosById(id);
        if(valores != null){
            System.out.println("id Valor correspondiente: "+valores);
        }
    }
    
    //Recorrer la tabla Hash
    public void list(){
        for(int i = 0; i < size; i++){
            datLinkedListArray[i].list(i);
        }
    }
    
    //Agregar datos a la tabla hash
    public void add(datos dat){
        //Seleccione la lista vinculada segun la identificacion del empleado
        int datLinkedListNo = hashFun(dat.id);
        
        //Añadimos a la lista vinculada
        datLinkedListArray[datLinkedListNo].addDatos(dat);
    }
    
    //Escribe una funcion hash y usa un metodo de modulo simple    
    private int hashFun(int id){
        return id % size;
    }
    
    //
}
