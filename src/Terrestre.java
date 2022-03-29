import java.util.Random;

public class Terrestre extends Planeta{

    public Terrestre(String nombre, double size, double peso, double x, double y) {
        super(nombre,size,peso,x,y);
    }

    @Override
    public boolean getProbabilidad() {

        Random r= new Random();
        int prob= r.nextInt(100)+1;
        System.out.println("La probabilidad es de:" + prob);

        return prob <= 25;
    }

}
