package animal;

public class Eagle extends Bird implements Flier{
    @Override
    public void fly() {
        System.out.println("Flying like an Eagle");
    }

    public Eagle(double weight, int speed, String name, String breed) {
        super(weight, speed, name, breed);
    }
}
