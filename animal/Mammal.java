package animal;

public abstract class Mammal extends Animal{

    private int gestation;

    public Mammal(double weight, int speed, String name, String breed, int gestation) {
        super(weight, speed, name, breed);
        this.gestation = gestation;
    }

    public Mammal(){
        this(0,0,null, null,5);
    }

    public String toString(){
        return super.toString() + ", gestation = " + gestation;
    }

    public final int getGestation() {
        return gestation;
    }
}
