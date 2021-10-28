package LAB61;

import java.security.SecureRandom;

public class Tiger extends Animal{
    private static final int MAX_SPEED = 100;

    public Tiger() {
        super(new SecureRandom().nextInt(MAX_SPEED));
    }

}
