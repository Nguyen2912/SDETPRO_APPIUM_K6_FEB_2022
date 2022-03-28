package lesson_09;

import java.security.SecureRandom;

public class animalWithBuilder {
    private int maxspeed;
    private int speed;
    private boolean withwings;
    private String name;
    private animalWithBuilder(){};

    protected animalWithBuilder(Builder builder){
        withwings = builder.withwings;
        maxspeed = builder.maxspeed;
        speed = new SecureRandom().nextInt(maxspeed);
        name = builder.name;
    }

    // Read only


    public int getSpeed() {
        return speed;
    }

    public boolean isWithwings() {
        return withwings;
    }

    public String getName() {
        return name;
    }

    //Customer service | inner class
    public static class Builder{
        private int maxspeed;
        private int speed;
        private boolean withwings;
        private String name;

        public void Withwings(boolean withwings) {
            this.withwings = withwings;
        }
        public void withMaxspeed(int maxspeed) {
            this.maxspeed = maxspeed;
        }

        public void withName(String name) {
            this.name = name;
        }

        public animalWithBuilder build() {
            return new animalWithBuilder(this);

        }
    }
}
