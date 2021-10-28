package LAB71;

import java.security.SecureRandom;

public class Horse extends Animal {
    private final int HORSE_MAX_SPEED = 70;

    public void speed(){
        int speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
    }

    public boolean flyable = false;

}
