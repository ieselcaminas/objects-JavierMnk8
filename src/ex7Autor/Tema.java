package ex7Autor;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private int cod_t;
    private List<Llibre> llibres;

    public Tema(int cod_t) {
        this.cod_t = cod_t;
        this.llibres = new ArrayList<Llibre>();
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void addLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    public int getCod_t() {
        return cod_t;
    }

    public void setCod_t(int cod_t) {
        this.cod_t = cod_t;
    }
}