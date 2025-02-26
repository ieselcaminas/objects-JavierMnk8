package Banco;
import java.util.ArrayList;
import java.util.List;

public class CC {
    private String n_cc;
    private Sucursal sucursal;
    private List<Client> clientes;
    private List<Domiciliacio> domiciliacions;

    public CC(String n_cc, Sucursal sucursal) {
        this.n_cc = n_cc;
        this.sucursal = sucursal;
        this.clientes = new ArrayList<>();
        this.domiciliacions = new ArrayList<>();
    }

    public String getN_cc() {
        return n_cc;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public List<Client> getClientes() {
        return clientes;
    }

    public List<Domiciliacio> getDomiciliacions() {
        return domiciliacions;
    }

    public void addClientes(Client cliente) {
        this.clientes.add(cliente);
    }

    public void addDomiciliacions(Domiciliacio domiciliacio) {
        this.domiciliacions.add(domiciliacio);
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return this.n_cc;
    }
}
