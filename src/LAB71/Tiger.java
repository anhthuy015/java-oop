package LAB71;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private final int TIGER_MAX_SPEED = 100;
    int speed = new SecureRandom().nextInt(TIGER_MAX_SPEED);

    public Tiger() {

    }

    public int speed() {
        return speed;
    }

    @Override
    public boolean flyable() {
        return false;
    }

}

