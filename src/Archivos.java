import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
    // Atributos
    ArrayList<Cientificos> cientificos; // Lista de scientific
    File Path; // Path del archivo

    public Archivos() {
        cientificos= new ArrayList<>();
        Path= new File("Scientific.lar");
        if(Path.exists()){
            load();
        }
    }

    public void addScientific(String nombre){
        if(Encontrar(nombre)==null){
            cientificos.add(new Cientificos(nombre));
            System.out.println("Se agrego el scientific: "+ nombre);
            try {
                save();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            load();
        }
    }

    public ArrayList<Cientificos> getScientific() {
        return cientificos;
    }

    public void load(){
        try {
            FileInputStream fis = new FileInputStream(Path);

            ObjectInputStream ois = new ObjectInputStream(fis);

            cientificos = (ArrayList<Cientificos>) ois.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void save() throws IOException{
        try {
            try (ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("Scientific.lar"))) {
                save.writeObject(cientificos);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cientificos Encontrar(String nombre){
        for(Cientificos c : cientificos){

            if(nombre.equals(c.getName())){
                return c;
            }
        }
        return null;
    }

}
