package LAB62;

public class Animal02 {

    private final boolean flyable;
    private final int speed;
    private final String name;


    private Animal02(Builder builder){
        this.flyable= builder.flyable;
        this.speed = builder.speed;
        this.name = builder.name;
    }

    public boolean isFlyable(){
        return this.flyable;
    }

    public int getSpeed(){
        return this.speed;
    }

    public String getName(){
        return this.name;
    }

    public static class Builder{
        private boolean flyable;
        private  int speed;
        private String name;

        public Builder flyable( boolean flyable){
            this.flyable = flyable;
            return this;
        }

        public Builder withSpeed(int speed){
            this.speed = speed;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Animal02 build(){
            return new Animal02(this);
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "flyable=" + flyable +
                ", animalSpeed=" + speed +
                '}';
    }
}
