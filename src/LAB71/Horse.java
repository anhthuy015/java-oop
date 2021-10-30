package LAB71;

import java.security.SecureRandom;

public class Horse extends Animal {
    private final int HORSE_MAX_SPEED = 70;
    int speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);

    public Horse() {

    }

    public int speed(){
        return speed;
    }

    @Override
    public boolean flyable() {
        return false;
    }

}
