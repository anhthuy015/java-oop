package LAB61;

import java.security.SecureRandom;

public class Dog extends Animal{

    private static final int MAX_SPEED = 60;

    public Dog() {
        super(new SecureRandom().nextInt(MAX_SPEED));
    }

}


