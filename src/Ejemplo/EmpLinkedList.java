package Ejemplo;

/**
 * @author GhostBarcenas
 */
public class EmpLinkedList {

    // encabezado de la lista de enlaces
    private Emp head;

    // eliminar
    public void deleteEmpById(int id) {
        if (head == null) {
            return;
        }
        Emp temp = head;

        while (true) {
            if (temp.id == id) {
                // eliminar
                head = temp.next;
                break;
            }

            if (temp.next == null) {
                break;
            }

            if (temp.next.id == id) {
                // Eliminar el nodo emp
                temp.next = temp.next.next;
                break;
            }

            // hacia atrás
            temp = temp.next;
        }
    }

    // Encuentra
    public Emp findEmpById(int id) {
        if (head == null) {
            return null;
        }
        Emp temp = head;
        while (true) {
            if (temp.id == id) {
                break;
            }
            if (temp.next == null) {
                temp = null;
                break;
            }
            // hacia atrás
            temp = temp.next;
        }
        return temp;
    }

    // atravesar
    public void list(int no) {
        if (head == null) {
            System.out.println("Sección" + (no + 1) + "La lista vinculada está vacía");
            return;
        }
        System.out.print("Sección" + (no + 1) + "Información de la lista vinculada para");
        Emp temp = head;
        while (true) {
            System.out.print(temp + " --> ");
            if (temp.next == null) {
                break;
            }
            // hacia atrás
            temp = temp.next;
        }
        System.out.println();
    }

    // agregar
    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        }
        Emp temp = head;
        while (temp.next != null) {
            // hacia atrás
            temp = temp.next;
        }
        temp.next = emp;
    }
}
