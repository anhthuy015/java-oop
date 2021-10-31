package LAB91;

import java.security.SecureRandom;

public class Tiger implements ISpeed {

    public static final int TIGER_MAX_SPEED = 100;
    int speed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
    @Override
    public int getSpeed() {
        return speed;
    }
}
