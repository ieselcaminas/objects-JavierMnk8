package Animales;

public class Tiburon extends Pez implements Jugar{
    public Tiburon(String nombre) {
        super(nombre);
    }
    @Override
    public void comunicarse(){
        System.out.println("no se que nigga");
    }
    @Override
    public void saltarPorUnAro(){
        System.out.println("salto aros soy un xulo");
    }
    @Override
    public void perseguirUnObjeto(){
        System.out.println("puedo perseguir un objeto");
    }
}
