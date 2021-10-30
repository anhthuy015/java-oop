package LAB71;

import java.security.SecureRandom;

public class falcon extends Animal {
    private final int FALCON_MAX_SPEED = 100;
    int speed = new SecureRandom().nextInt(FALCON_MAX_SPEED);

    public falcon() {

    }

    public int speed(){
       return speed;
    }

    @Override
    protected boolean flyable() {
        return true;
    }


}
