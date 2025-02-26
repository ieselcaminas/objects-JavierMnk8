package Animales;

public abstract class Pajaro extends Animal implements PonerHuevos {
    Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("pio pio nigga");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro");
    }

    @Override
    public void moverse() {
        System.out.println("vuelo");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("pongo Huevos");
    }
}
