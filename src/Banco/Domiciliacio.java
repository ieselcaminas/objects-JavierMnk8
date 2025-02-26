package Banco;
import java.util.ArrayList;
import java.util.List;

public class Domiciliacio {
    private String n_dom;
    private CC cc;

    public Domiciliacio(String n_dom, CC cc) {
        this.n_dom = n_dom;
        this.cc = cc;
    }

    public String getN_dom() {
        return n_dom;
    }

    public void setN_dom(String n_dom) {
        this.n_dom = n_dom;
    }

    public CC getCc() {
        return cc;
    }

    public void setCc(CC cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return this.n_dom;
    }
}
