package nilesh.general;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 24;

        if(PrimeNumberCheck(number)){
            System.out.println("This is "+number+ " a Prime Number");
        }
        else{
            System.out.println("This is "+number+ " not a Prime Number");
        }

    }

    public static boolean PrimeNumberCheck(int num){

        if(num < 2){
            return false;   //If number is less than 2, it's not prime
        }

        for(int i=2; i<num; i++){

            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
