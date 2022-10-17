import java.util.List;
import java.util.LinkedList;

import objetos.parcial2.tarea4.*;

public class Main {

    public static void main(String[] args){

        List<Animal> animales = new LinkedList<>();

        animales.add(new Aguila());
        animales.add(new Animal());
        animales.add(new Ave());
        animales.add(new Condor());
        animales.add(new Gato());
        animales.add(new Gorrion());
        animales.add(new Mamifero());
        animales.add(new Halcon());
        animales.add(new Pez());
        animales.add(new Perro());
        animales.add(new Raton());
        animales.add(new Salmon());
        animales.add(new Sardina());
        animales.add(new Tilapia());
        animales.add(new Trucha());

        for(Animal animal :animales){
            System.out.println(animal.toString());
        }

    }
}
