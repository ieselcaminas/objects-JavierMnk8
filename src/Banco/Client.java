package Banco;
import java.util.*;

public class Client {
    private String dni;
    private String nombre;
    private List<CC> ccs;
    private List<Prestec> prestecs;

    public Client(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.ccs = new ArrayList<>();
        this.prestecs = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public List<CC> getCcs() {
        return ccs;
    }

    public List<Prestec> getPrestecs() {
        return prestecs;
    }

    public void addPrestecs(Prestec prestec) {
        this.prestecs.add(prestec);
    }

    public void addccs(CC cc){
        this.ccs.add(cc);
    }

    @Override
    public String toString() {
        return this.dni + " - " + this.nombre;
    }
}
