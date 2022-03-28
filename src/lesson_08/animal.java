package lesson_08;

import java.security.SecureRandom;

public class animal {
    private int speed;
    private int maxspeed;

    public animal(int maxspeed) {
        this.maxspeed = maxspeed;
        this.speed = new SecureRandom().nextInt(maxspeed);
    }

    public int getSpeed() {
        return speed;
    }
}
