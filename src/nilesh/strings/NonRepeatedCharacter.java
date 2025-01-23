package nilesh.strings;

public class NonRepeatedCharacter {
    public static void main(String[] args) {

        String str = "swiss";

        char result = FindNonRepeatedCharacter(str);

        if(result != 0){
            System.out.println("The first non-repeated character is: " +result);
        } else {
            System.out.println("No non-repeated character found");
        }
    }

    public static char FindNonRepeatedCharacter(String str){

        for (int i = 0; i < str.length(); i++){

            char currentchar = str.charAt(i);
            boolean isrepeated = false;

            for (int j = 0; j < str.length(); j++){

                if(i != j && currentchar == str.charAt(j)){
                    isrepeated = true;
                    break;
                }
            }
             if(!isrepeated){
                 return currentchar;
             }
        }
        return 0;
    }
}