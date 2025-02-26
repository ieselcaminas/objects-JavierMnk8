package ex7Autor;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private String nombre;
    private int cod_ed;
    private List<Llibre> llibres;

    public Editorial(int cod_ed, String nombre) {
        this.llibres = new ArrayList<Llibre>();
        this.cod_ed = cod_ed;
        this.nombre = nombre;
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public void addLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_ed() {
        return cod_ed;
    }

    public void setCod_ed(int cod_ed) {
        this.cod_ed = cod_ed;
    }
}