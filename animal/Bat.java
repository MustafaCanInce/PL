package animal;

public class Bat extends Mammal implements Flier{
    @Override
    public void fly() {
        System.out.println("Flying like a bat;");
    }

    public Bat(double weight, int speed, String name, String breed, int gestation) {
        super(weight, speed, name, breed, gestation);
    }




}
