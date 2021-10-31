package LAB91;

import java.security.SecureRandom;

public class Falcon implements ISpeed , IFlyable {

    public static final int FALCON_MAX_SPEED = 90;
    int speed = new SecureRandom().nextInt(FALCON_MAX_SPEED);
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean flyAbe() {
        return true;
    }
}
