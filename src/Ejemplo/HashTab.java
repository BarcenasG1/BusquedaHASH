package Ejemplo;

/**
 * @author GhostBarcenas
 */
public class HashTab {

    // matriz de lista vinculada
    private EmpLinkedList[] empLinkedListArray;
    private int size;

    // constructor
    public HashTab(int size) {
        // inicializar
        this.empLinkedListArray = new EmpLinkedList[size];
        this.size = size;
        // Necesita inicializar cada lista vinculada
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i] = new EmpLinkedList();
        }
    }

    // Eliminar información emp de la tabla hash de acuerdo con la identificación
    public void deleteById(int id) {
        int is = hashFun(id);
        empLinkedListArray[is].deleteEmpById(id);
    }

    // Encuentra información emp de la tabla hash según id
    public void findEmpById(int id) {
        int is = hashFun(id);
        Emp emp = empLinkedListArray[is].findEmpById(id);
        if (emp != null) {
            System.out.println("id valor correspondiente:" + emp);
        }
    }

    // Recorrer la tabla hash
    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i].list(i);
        }
    }

    // Agrega emp a la tabla hash
    public void add(Emp emp) {

        // Seleccione la lista vinculada según la identificación del empleado
        int empLinkedListNO = hashFun(emp.id);

        // Añadir a la lista vinculada
        empLinkedListArray[empLinkedListNO].add(emp);
    }

    // Escribe una función hash y usa un método de módulo simple
    private int hashFun(int id) {
        return id % size;
    }
}
