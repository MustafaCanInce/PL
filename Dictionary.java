public class Dictionary implements IDictionary{

    private String[] data;
    private int count;

    public Dictionary(int size){

        data = new String[size];
    }

    public void reset(int size){
        data = new String[size];

    }

    public void add(String item){
        if (!contains(item)) {
            data[count] = item;
            count++;
        }
    }

    public boolean contains(String item){
        for(int i = 0; i<count; i++){
            if(item.equals(data[i]))
                return true;
        }
        return false;
    }
}
