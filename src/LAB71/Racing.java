package LAB71;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal horse = new Horse();
        Animal falcon = new FALCON();


        List<Animal> animals = Arrays.asList(tiger, horse, falcon);
        List<Animal> applicableAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if(!animal.flyable())
                applicableAnimals.add(animal);
        }
        Animal winner = null;
        for (Animal animal : applicableAnimals) {
            System.out.println(animal.getClass().getSimpleName() + " has speed "+ animal.speed());

        }

        for (Animal animal: applicableAnimals) {
            if(winner == null) {
                winner = animal;
            }else if(animal.speep() > winner.speed())
                winner = animal;

        }

        System.out.println("the winner is: " + winner.getClass().getSimpleName() + " with speed " + winner.speed());



    }
}
