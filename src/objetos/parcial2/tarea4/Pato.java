package objetos.parcial2.tarea4;

public class Pato extends Animal implements AnimalQueVuela,AnimalQueNada,AnimalQueCamina{

   public String toString(){
       return "Pato";
   }

    @Override
    public void caminar() {

    }

    @Override
    public void nadar() {

    }

    @Override
    public void volar() {

    }
}
