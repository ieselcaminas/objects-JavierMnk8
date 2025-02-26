package Animales;

public class Gato extends Mamifero implements Jugar {
    public Gato(String nombre) {
        super(nombre);
    }
    @Override
    public void comunicarse(){
        System.out.println("miau miau nigga");
    }
    @Override
    public void saltarPorUnAro(){
        System.out.println("Se saltar x un aro");
    }
    @Override
    public void perseguirUnObjeto(){
        System.out.println("se perseguir un objeto");
    }
    public void ovillo(){
        System.out.println("persigo un ovillo");
    }
}
