package ex7Autor;

import java.util.List;

public class Historic {
    private int data_p;
    private int data_t;
    private Exemplar exemplar;
    private Lector lector;

    public Historic(int data_p, int data_t, Exemplar exemplar, Lector lectores) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.exemplar = exemplar;
        this.lector = lectores;
    }
    public Exemplar getExemplar() {
        return exemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public int getData_p() {
        return data_p;
    }

    public void setData_p(int data_p) {
        this.data_p = data_p;
    }

    public int getData_t() {
        return data_t;
    }

    public void setData_t(int data_t) {
        this.data_t = data_t;
    }
}