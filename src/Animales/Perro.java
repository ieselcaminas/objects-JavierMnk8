package Animales;

public class Perro extends Mamifero {
    Perro(String nombre) {
        super(nombre);
    }

    public void traerZapatillas() {
        System.out.println("traigo zapatillas");
    }

    @Override
    public void comunicarse() {
        System.out.println("guau guau nigga");
    }
}
