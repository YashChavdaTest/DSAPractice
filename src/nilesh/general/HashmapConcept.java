package nilesh.general;
import java.util.HashMap;

public class HashmapConcept {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();  //Created a Hashmap

        //Insertion
        map.put("India", 120);  //Add a value
        map.put("China", 150);
        map.put("US",40);

        map.put("China", 100);  //Update the value

        //Search
        if(map.containsKey("Africa")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }

        //Retrieve the data
        System.out.println(map.get("China"));
        System.out.println(map.get("Africa"));

        System.out.println(map);
    }
}
