package LAB91;

import java.security.SecureRandom;

public class Dog implements ISpeed {

    public static final int DOG_MAX_SPEED = 70;
    int speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
    @Override
    public int getSpeed() {
        return speed;
    }
}
