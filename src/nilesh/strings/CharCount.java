package nilesh.strings;

public class CharCount {

    public static void main(String[] args) {

        String inputstr = "hello world";
        char targetchar = 'o';

        int result = CharacterCount(inputstr, targetchar);

        System.out.println("The character " + targetchar + " appears " +result+ " times in the string");

    }

    public static int CharacterCount(String inputstr, char ch){
        int count = 0;

        for(char c : inputstr.toCharArray()) {
            if (c == ch){
                count++;
            }
        }
        return count;
    }
}
