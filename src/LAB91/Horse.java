package LAB91;

import java.security.SecureRandom;

public class Horse implements ISpeed {

    public static final int HORSE_MAX_SPEED = 70;
    int speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
    @Override
    public int getSpeed() {
        return speed;
    }
}
