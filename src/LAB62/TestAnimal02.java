package LAB62;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAnimal02 {

    private static final int TIGER_MAX_SPEED = 100;
    private static final int HORSE_MAX_SPEED = 70;
    private static final int FALCON_MAX_SPEED = 80;

    public static void main(String[] args) {
        Animal02 tiger = new Animal02.Builder()
                                     .flyable(false)
                                     .withSpeed(new SecureRandom().nextInt(TIGER_MAX_SPEED))
                                     .name("tiger").build();

        Animal02 horse = new Animal02.Builder()
                .flyable(false)
                .withSpeed(new SecureRandom().nextInt(HORSE_MAX_SPEED))
                .name("horse").build();

        Animal02 falcon = new Animal02.Builder()
                .flyable(true)
                .withSpeed(new SecureRandom().nextInt(FALCON_MAX_SPEED))
                .name("falcon").build();

        List<Animal02> animals = Arrays.asList(tiger, horse, falcon);
        List<Animal02> applicableAnimals = new ArrayList<>();
        for (Animal02 animal : animals) {
            if(!animal.isFlyable())
                applicableAnimals.add(animal);
        }
        Animal02 winner = null;
        for (Animal02 animal : applicableAnimals) {
            System.out.println(animal.getName() + " has speed "+ animal.getSpeed());

        }

        for (Animal02 animal: applicableAnimals) {
            if(winner == null) {
                winner = animal;
            }else if(animal.getSpeed() > winner.getSpeed())
                winner = animal;

        }

        System.out.println("the winner is: " + winner.getName() + " with speed " + winner.getSpeed());

    }

}
