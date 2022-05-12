package animal;

public class TestAnimal {

    public static void main(String[] args){
        //Animal animal = new Animal();

        //Mammal mammal = new Mammal();

        Zoo myZoo = new Zoo();
        myZoo.animals.add(new Bat(3,30,"Black","Cave",4));
        myZoo.animals.add(new Cat(5,20,"Tarcin","Ankara",3));
        myZoo.animals.add(new Eagle(4,50,"Brave","Anatolian"));

        myZoo.flyAll();

        String info = myZoo.toString();

        System.out.println(info);

    }
}
