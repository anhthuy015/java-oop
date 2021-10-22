package LAB61;

import java.security.SecureRandom;
import java.util.Scanner;

public class TestAnimal01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horseSpeed = new SecureRandom().nextInt(75);
        Animal horse = new Horse(horseSpeed);
        System.out.println(" Horse's speed: " + horseSpeed);

        int tigerSpeed = new SecureRandom().nextInt(100);
        Animal tiger = new Horse(tigerSpeed);
        System.out.println(" Tiger's speed: " + tigerSpeed);

        int dogSpeed = new SecureRandom().nextInt(60);
        Animal dog = new Horse(dogSpeed);
        System.out.println(" Dog's speed: " + dogSpeed);

        if (horseSpeed > tigerSpeed) {
            if (horseSpeed > dogSpeed) {
                System.out.println("winner is " + horse.getClass().getSimpleName() + "with speed: " + horseSpeed);
            } else System.out.println("winner is " + dog.getClass().getSimpleName() + "with speed: " + dogSpeed);
        } else
        if(tigerSpeed > dogSpeed){
            System.out.println("winner is "+ tiger.getClass().getSimpleName() + "with speed: " + tigerSpeed);
        } else
            System.out.println("winner is " + dog.getClass().getSimpleName() + "with speed: " + dogSpeed);

    }
}
