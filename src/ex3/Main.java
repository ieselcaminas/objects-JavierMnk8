package ex3;

public class Main {
    public static void main(String[] args) {

        Cuenta c = new Cuenta("Morales",10);
        Cuenta c2 = new Cuenta("Manel",1100);
        Cuenta c3 = new Cuenta("Juan",200);

        c2.ingresar(100);
        c.retirar(100);
        c3.retirar(300);

        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
    }

}
