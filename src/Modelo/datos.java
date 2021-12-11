package Modelo;

/**
 * @author GhostBarcenas
 */
public class datos {

    public int id;
    public String name;
    public datos next;

    public datos(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "datos{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
