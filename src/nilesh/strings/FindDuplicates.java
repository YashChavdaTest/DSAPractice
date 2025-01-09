package nilesh.strings;
import java.util.HashSet;

public class FindDuplicates {

    public static void main(String[] args) {
        String str = "Programming";

        FindDuplicatesCharacter(str);
    }

    public static void  FindDuplicatesCharacter (String str) {

        HashSet<Character> seen = new HashSet<>();  //Created Hashset to track characters

        for(int i = 0; i <str.length(); i++){

            char ch = str.charAt(i);

            if(seen.contains(ch)){
                System.out.println("Duplicate Character: " +ch);
            }else {
                seen.add(ch);
            }
        }
    }
}
