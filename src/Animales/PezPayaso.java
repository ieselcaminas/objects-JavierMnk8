package Animales;

public class PezPayaso extends Pez{
    PezPayaso(String nombre) {
        super(nombre);
    }
    @Override
    public void comunicarse(){
        System.out.println("glup glup nigga");
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
