package LAB61;

import java.security.SecureRandom;

public class Horse extends Animal{
    private static final int MAX_SPEED = 75;

    public Horse() {
        super(new SecureRandom().nextInt(MAX_SPEED));
    }

}
