package yash.hashmap;

import java.util.HashMap;
import java.util.Map;

public class BasicOperations {
    public static void main(String args[]){
        BasicOperations b1 = new BasicOperations();
        b1.Traverse();
    }


    public void Traverse(){
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"mango");
        map.put(4,"kiwi");
        map.put(5,"orange");
        map.put(6,"papaya");
        map.put(7,"custard apple");
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }
    }
}
