package animal;

public abstract class Animal extends Object{
    private double weight;
    private int speed;
    private String name;
    private String breed;

    public Animal(double weight, int speed, String name, String breed) {
        this.weight = weight;
        this.speed = speed;
        this.name = name;
        this.breed = breed;
    }


    public String toString(){
        return "weight = " + weight + ", " +
                "speed = " + speed + ", " +
                "name = " + name +", " +
                "breed = " + breed;

    }

}
