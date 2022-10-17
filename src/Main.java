import objetos.parcial2.tarea4.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
        animales.add(new Pato());
        animales.add(new Pez());
        animales.add(new Perro());
        animales.add(new Raton());
        animales.add(new Salmon());
        animales.add(new Sardina());
        animales.add(new Tilapia());
        animales.add(new Trucha());
        animales.add(new Tortuga());

        for(Animal animal :animales){
            System.out.println(animal.toString());
        }
        parbada(Arrays.asList(
                new Gorrion(),
                new Halcon(),
                new Pato()
        ));

        manada(Arrays.asList(
                new Perro()
        ));
    }

    public static void parbada(List<AnimalQueVuela> voladores){
        for (AnimalQueVuela animal : voladores){
            animal.volar();
        }
    }

    public static void manada(List<AnimalQueCamina> caminador){
        for (AnimalQueCamina animal: caminador){
            animal.caminar();
        }
    }


}
