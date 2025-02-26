package ex7Autor;

import java.util.ArrayList;
import java.util.List;

public class Llibre {
    private String nombre;
    private int isbn;
    private List<Autor> autores;
    private List<Exemplar> exemplars;

    public Llibre(String nombre, int isbn) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.autores = new ArrayList<Autor>();
        this.exemplars = new ArrayList<Exemplar>();
    }

    public void addAutores(Autor autor){
        autores.add(autor);
    }

    public void addExemplars(Exemplar exemplar){
        exemplars.add(exemplar);
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Exemplar> getExemplars() {
        return exemplars;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}