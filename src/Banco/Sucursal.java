package Banco;
import java.util.ArrayList;
import java.util.List;


public class Sucursal {
    private int n_suc;
    private String nombre;
    private Banco banco;
    private List<Prestec> prestecs;
    private List<CC> ccs;

    public Sucursal(int n_suc, String nombre, Banco banco) {
        this.n_suc = n_suc;
        this.nombre = nombre;
        this.banco = banco;
        this.prestecs = new ArrayList<>();
        this.ccs = new ArrayList<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public String getNombre() {
        return nombre;
    }

    public Banco getBanco() {
        return banco;
    }

    public List<Prestec> getPrestecs() {
        return prestecs;
    }

    public List<CC> getCCs() {
        return ccs;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void addPrestecs(Prestec prestec) {
        this.prestecs.add(prestec);
    }

    public void addCCs(CC cc) {
        this.ccs.add(cc);
    }

    @Override
    public String toString() {
        return nombre + " - " + n_suc;
    }
}
