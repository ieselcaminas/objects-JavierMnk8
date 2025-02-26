package Banco;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Banco bbva = new Banco(1, "BBVA");
            Sucursal castellon = new Sucursal(1, "Castellon", bbva);
            Client morales = new Client("26599698Z", "Morales");
                CC cc1 = new CC("1234", castellon);
                Prestec prestec1 = new Prestec(1, castellon, morales);



    }
}
