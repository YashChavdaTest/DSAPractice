package nilesh.strings;

import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        boolean result = IsAnagram(str1, str2);

        System.out.println("Are these Strings Anagram? " +result);

    }

    public static boolean IsAnagram(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }


}
