package ex7Autor;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private int cod_aut;
    private List<Llibre> llibres;

    public Autor(String nombre, int cod_aut) {
        this.nombre = nombre;
        this.cod_aut = cod_aut;
        this.llibres = new ArrayList<Llibre>();
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

    public int getCod_aut() {
        return cod_aut;
    }

    public void setCod_aut(int cod_aut) {
        this.cod_aut = cod_aut;
    }
}