package nilesh.array;

public class Palindrome {
    public static void main(String[] args) {
        String input = "madam";

        if(input.equals(new StringBuilder(input).reverse().toString())){
            System.out.println(input + "is a Palindrome");
        }
        else{
            System.out.println(input + "is not a Palindrome");
        }

        int numbers = 12321;
        String numstr = Integer.toString(numbers);  //Convert int into string

        if(numstr.equals(new StringBuilder(numstr).reverse().toString())){

            System.out.println(numbers + "is a Palindrome");
        } else {
            System.out.println(numbers + "is not a Palindrome");
        }
    }
}
