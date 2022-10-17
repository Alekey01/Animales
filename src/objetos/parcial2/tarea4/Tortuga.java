package objetos.parcial2.tarea4;

public class Tortuga extends Animal implements AnimalQueNada, AnimalQueCamina{

   public String toString(){
       return "Tortuga";
   }

    @Override
    public void caminar() {

    }

    @Override
    public void nadar() {

    }
}
