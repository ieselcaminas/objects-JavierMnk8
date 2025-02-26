package Animales;

public class Entrenador extends Mamifero{
    Entrenador(String nombre){
        super(nombre);
    }
    @Override
    public void comunicarse(){
        System.out.println("Hola buenas tardes, nigga");
    }
    public void entrenar(Jugar animalSabeJugar){
        animalSabeJugar.saltarPorUnAro();
    }
    public void dejarEntrar(Animal animal){
        if(animal instanceof Jugar){
            System.out.println("Pasa");
        }else
            throw new IllegalArgumentException(animal.getClass().getName() + " no sabe jugar");
    }
}
