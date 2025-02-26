package Animales;

public abstract class Pez extends Animal {
    public Pez(String nombre) {
        super(nombre);
    }
    @Override
    public void respirar(){
        System.out.println("uso las branquias");
    }
    @Override
    public void moverse(){
        System.out.println("nado con la cola");
    }
}
