package Animales;

public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }
    public void mamar(){
        System.out.println("me gusta mamarla");
    }
    @Override
    public void respirar(){
        System.out.println("tengo pulmones");
    }
    @Override
    public void moverse(){
        System.out.println("me muevo a 4 patas");
    }
}