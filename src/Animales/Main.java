package Animales;

public class Main {
    public static void main(String[] args) {

    Perro perro = new Perro("Toby");
    perro.comunicarse();
    perro.traerZapatillas();
    perro.mamar();

    Gato gato = new Gato("Kuro");
    gato.comunicarse();
    gato.ovillo();
    gato.mamar();
    gato.respirar();

    Tiburon tiburon = new Tiburon("Tiburon");
    tiburon.comunicarse();
    tiburon.respirar();

    Entrenador pepe = new Entrenador("Pepe");
    pepe.entrenar(gato);
    pepe.entrenar(tiburon);

    pepe.dejarEntrar(gato);

    perro.setNombre("Oscar");
        System.out.println(perro);
        pepe.dejarEntrar(gato);
    }
}
