package animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals = new ArrayList<>();


    void flyAll(){
        for(Animal animal : animals){
            if(animal instanceof  Flier){
                Flier flier = ((Flier) animal);
                System.out.println(animal.getClass().getName());
                System.out.println(animal.getClass());
                System.out.println(animal.hashCode());
                System.out.println(animal.toString());
                flier.fly();
            }
        }
    }
    @Override
    public String toString(){
        String info;
        info = "Number of animals = " + animals.size();
        for(Animal animal : animals){
            info = info + "\n" + animal.toString();
        }

        return info;
    }
}
