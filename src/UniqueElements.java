import java.util.ArrayList;

public class UniqueElements <T>{

    private ArrayList<T> array = new ArrayList<>();


    public void add(T element){
        if (array.contains(element)){
            System.out.println("Element already exists");
        }else{
            array.add(element);
        }
    }

    public void print(){
        for (T element : array){
            System.out.println(element);
        }
    }
    public void contains(T element){
        if (array.contains(element)){
            System.out.println("Element already exists");
        }else{
            System.out.println("Element does not exist");
        }
    }
}
