package nilesh.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";

        String reversedStr = reverseString(str);

        System.out.println("Reversed String: " + reversedStr);
    }

//    public static String reverseString(String str) {
//
//        StringBuilder reversed = new StringBuilder();
//
//        for(int i=str.length() - 1; i >=0; i--){
//            reversed.append(str.charAt(i));
//        }
//        return reversed.toString();
//    }

    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}

