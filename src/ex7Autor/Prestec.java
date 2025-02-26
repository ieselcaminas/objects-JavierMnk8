package ex7Autor;

import java.util.ArrayList;
import java.util.List;

public class Prestec {
    private int data_p;
    private List<Exemplar> exemplars;
    private Lector lector;

    public Prestec(int data_p, Lector lector) {
        this.data_p = data_p;
        this.exemplars = new ArrayList<>();
        this.lector = lector;
    }

    public List<Exemplar> getExemplars() {
        return exemplars;
    }

    public void addExemplar(Exemplar exemplar) {
        exemplars.add(exemplar);
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public int getData_p() {
        return data_p;
    }

    public void setData_p(int data_p) {
        this.data_p = data_p;
    }
}