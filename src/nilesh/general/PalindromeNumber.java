package nilesh.general;

public class PalindromeNumber {
    public static void main(String[] args) {

        int number = 121695;

        if(isPalindrome(number)){
            System.out.println("The Integer " +number+ " is a Palindrome");
        }
        else{
            System.out.println("The Integer " +number+ " is not a Palindrome");
        }
    }

    public static boolean isPalindrome(int num){

        String str = Integer.toString(num); //Converting integer to a string

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
