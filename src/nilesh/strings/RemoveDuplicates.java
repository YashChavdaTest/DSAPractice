package nilesh.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "Programming";

        String result = RemoveDuplicateCharacters(str);

        System.out.println("Original String: " +str);
        System.out.println("String after removing duplicates: " +result);
    }

 public static String RemoveDuplicateCharacters(String str){

     LinkedHashSet<Character> UniCharacters = new LinkedHashSet<>();  //store unique elements and insert in oder of elements

     for (int i = 0; i < str.length(); i++){
         UniCharacters.add(str.charAt(i));
     }

     String result = "";

     for (char ch : UniCharacters){
         result += ch;
     }
     return result;
 }
}
