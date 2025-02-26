package ex7Autor;

import java.util.ArrayList;
import java.util.List;

public class Exemplar {
    private int n_reg;
    private Llibre llibre;
    private Historic historic;
    private Prestec prestec;

    public Exemplar(int n_reg, Llibre llibre) {
        this.n_reg = n_reg;
        this.llibre = llibre;
        this.historic = historic;
        this.prestec = prestec;
    }


    public Llibre getLlibre() {
        return llibre;
    }

    public Prestec getPrestec() {
        return prestec;
    }

    public void setPrestec(Prestec prestec) {
        this.prestec = prestec;
    }

    public Historic getHistoric() {
        return historic;
    }

    public void setHistoric(Historic historic) {
        this.historic = historic;
    }

    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

}