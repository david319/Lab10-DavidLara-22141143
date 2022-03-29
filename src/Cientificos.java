import java.io.Serializable;
import java.util.ArrayList;

public class Cientificos implements Serializable {
    // Atributos
    ArrayList<Planeta> Descubrimientos;
    String name;

    public Cientificos(String name) {
        Descubrimientos = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Planeta> getDescubrimientos() {
        return Descubrimientos;
    }

    public Planeta Encontrar(String nombre) {
        for (Planeta p : Descubrimientos) {
            if (nombre.equals(p.getNombre())) {
                return p;
            }
        }
        return null;
    }

    public void AddPlaneta(Planeta planet) {
        Descubrimientos.add(planet);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
