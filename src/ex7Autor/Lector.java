package ex7Autor;

import java.util.List;

public class Lector {
    private List<Exemplar> exemplars;
    private String dni;
    private String nombre;
    private Historic historic;
    private Prestec prestec;

    public Lector(String dni, String nombre) {
        this.exemplars = exemplars;
        this.dni = dni;
        this.nombre = nombre;
        this.historic = historic;
        this.prestec = prestec;
    }

    public List<Exemplar> getExemplars() {
        return exemplars;
    }

    public void addExemplar(Exemplar exemplar) {
        this.exemplars.add(exemplar);
    }

    public Prestec getPrestec() {
        return prestec;
    }

    public void setPrestec(Prestec prestec) {
        this.prestec = prestec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Historic getHistoric() {
        return historic;
    }

    public void setHistoric(Historic historic) {
        this.historic = historic;
    }
}