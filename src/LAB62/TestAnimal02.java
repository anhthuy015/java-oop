package LAB62;

import LAB62.Animal02.Builder;

import java.security.SecureRandom;
import java.util.Scanner;

public class TestAnimal02 {

    public static void main(String[] args) {

        final int EAGLE_MAX_SPEED = 100;
        final int FALCON_MAX_SPEED = 90;
        final int TIGER_MAX_SPEED = 120;
        final int SNAKE_MAX_SPEED = 50;

        Scanner scanner = new Scanner(System.in);
        Builder builder = new Builder();
        Animal02 eagle = builder.isFlyable(true).howMuchAnimalSpeed(new SecureRandom().nextInt(EAGLE_MAX_SPEED)).build();
        System.out.println( eagle);
    }

}
