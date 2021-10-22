package LAB62;

public class Animal02 {

    private final boolean flyable;
    private final int animalSpeed;
    private final String animalName;


    private Animal02(Builder builder){
        flyable= builder.flyable;
        animalSpeed = builder.animalSpeed;
    }
    public static class Builder{
        private boolean flyable;
        private  int animalSpeed;

        public Builder isFlyable( boolean flyable){
            this.flyable = false;
            return this;
        }

        public Builder howMuchAnimalSpeed(int animalSpeed){
            this.animalSpeed = animalSpeed;
            return this;
        }
        public Animal02 build(){return new Animal02(this);}

    }

    @Override
    public String toString() {
        return "Animal{" +
                "flyable=" + flyable +
                ", animalSpeed=" + animalSpeed +
                '}';
    }
}
