package LAB71;

import java.security.SecureRandom;

public class FALCON extends Animal {
    private final int FALCON_MAX_SPEED = 100;

    public void speed(){
       int speed = new SecureRandom().nextInt(FALCON_MAX_SPEED);
    }

    public boolean flyable = true;

}
