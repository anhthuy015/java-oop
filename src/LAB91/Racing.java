package LAB91;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Racing {
    public static void performFlying(List<IFlyable> flyableObject) {
        for (IFlyable iFlyable : flyableObject) {
            Racing.performFlying(Arrays.asList());
            System.out.println(flyableObject.getClass().getSimpleName() + " with speed " );
        }

    }

    public static int getSpeedAnimal(List<ISpeed> animalList){
            for (ISpeed speedAnimal : animalList) {
               System.out.println(speedAnimal.getClass().getSimpleName() + " with speed " + speedAnimal.getSpeed());
           } return 0;
    }


    public static void main(String[] args) {
        System.out.println(Racing.getSpeedAnimal(Arrays.asList(
                new Dog(),
                new Horse(),
                new Falcon(),
                new Tiger()
        )));



    }
//    public static void main(String[] args) {
//        Tiger tiger = new Tiger();
//        tiger.speed();
//        Horse horse = new Horse();
//        horse.speed();
//        Falcon falcon = new falcon();
//        falcon.speed();
//
//        List<Animal> animals = Arrays.asList(tiger, horse, falcon);
//        List<Animal> applicableAnimals = new ArrayList<>();
//        for (Animal animal : animals) {
//            if(!animal.flyable())
//                applicableAnimals.add(animal);
//        }
//        Animal winner = null;
//        for (Animal animal : applicableAnimals) {
//            System.out.println(animal.getClass().getSimpleName() + " with speed " + animal.speed());
//
//        }
//
//        for (Animal animal: applicableAnimals) {
//            if(winner == null) {
//                winner = animal;
//            }else if(animal.speed() > winner.speed())
//                winner = animal;
//
//        }
//
//        System.out.println("the winner is: " + winner.getClass().getSimpleName() + " with speed " + winner.speed());
//
//
//
//    }
}



