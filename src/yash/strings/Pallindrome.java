package yash.strings;

public class Pallindrome {
    public static void main(String args[]){
        String string="MADAM";
        Boolean result = PallindromeOrNot(string);
        System.out.println("Result is "+result);
    }

    public static boolean PallindromeOrNot(String string){
        int start=0;
        int end = string.length() -1;
        for(int i=end;i>=0;i--){
            if(string.charAt(i)!= string.charAt(start)){
                return false;
            }
            start++;
        }
        return true;
    }
}