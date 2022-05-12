import java.util.ArrayList;

public class Dictionary2 implements IDictionary{

    private ArrayList<String> data;
    private int count;

    public Dictionary2(){

        data = new ArrayList<>();
    }



    public void add(String item){
        if (!data.contains(item)) {
            data.add(item);
        }
    }

    public boolean contains(String item){
        return data.contains(item);
    }
}
