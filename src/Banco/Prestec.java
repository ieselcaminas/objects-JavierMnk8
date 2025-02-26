package Banco;
import java.util.ArrayList;
import java.util.List;

public class Prestec {
    private int num_p;
    private Sucursal sucursal;
    private Client client;

    public Prestec(int num_p, Sucursal sucursal, Client client) {
        this.num_p = num_p;
        this.sucursal = sucursal;
        this.client = client;
    }

    public int getNum_p() {
        return num_p;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "" + this.num_p;
    }
}
