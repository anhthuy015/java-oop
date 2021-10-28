package LAB61;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal horse = new Horse();
        Animal dog = new Dog();

        List<Animal> animals = new ArrayList<>();
        animals.add(tiger);
        animals.add(horse);
        animals.add(dog);

        Animal winner = null;

        if(animals.isEmpty())
            System.out.println("There is no animals!");

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " has speed "+ animal.getSpeed());

        }
        for (Animal animal : animals) {
            if(winner == null){
                winner = animal;
            } else {
                if(animal.getSpeed() > winner.getSpeed())
                    winner = animal;
            }
        }

        System.out.println("the winner is: " + winner.getClass().getSimpleName() + " with speed " + winner.getSpeed());

    }
}
