package ex7Autor;

public class MainEJ7 {
    public static void main(String[] args) {

    Autor autor = new Autor("Maria", 25);

    Llibre libro = new Llibre("Castellano", 2030405060);

    Exemplar exemplar = new Exemplar(1, libro);

    libro.addAutores(autor);

    autor.addLlibre(libro);


    Editorial editorial = new Editorial(2, "Planeta");

    Tema tema = new Tema(3);
    Lector lector = new Lector("20958383R", "Cristina");
    Prestec prestec = new Prestec(4, lector);
    prestec.addExemplar(exemplar);
    
    Historic historic = new Historic(1, 1, exemplar, lector);

    }
}