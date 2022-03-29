import java.io.Serializable;

public abstract class Planeta implements Serializable {
    // Atributos
    String nombre;
    double size;
    double peso;
    double x;
    double y;

    public Planeta(String nombre, double size, double peso, double x, double y) {
        this.nombre = nombre;
        this.size = size;
        this.peso = peso;
        this.x = x;
        this.y = y;
    }

    public abstract boolean getProbabilidad();

    public String getNombre() {
        return nombre;
    }

    public double getSize() {
        return size;
    }

    public double getPeso() {
        return peso;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return nombre;
    }
}
