package LAB71;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private final int TIGER_MAX_SPEED = 100;

    public void speed(){
       int speed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
    }

    public boolean flyable = false;



}
