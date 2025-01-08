package nilesh.strings;

public class VowelConsonantCounter {
    public static void main(String[] args) {

        String str = "My Name is Nilesh Kasane";

        int[] counts = CountVowelsandConsonants(str);

        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }

    public static int[] CountVowelsandConsonants(String str){

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();  //Convert to lowercase for case-insensitive

        for (char ch : str.toCharArray()){

            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
                vowels++;
            } else if (ch >= 'a' && ch<= 'z') {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
}

