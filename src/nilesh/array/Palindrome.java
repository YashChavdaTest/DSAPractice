package nilesh.array;

public class Palindrome {
    public static void main(String[] args) {
        String input = "radar";

        if(isPalindrome(input)){
            System.out.println("The String" +input+ "is a Palindrome");
        }
        else{
            System.out.println("The String" +input+ "is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while(start < end){

            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
