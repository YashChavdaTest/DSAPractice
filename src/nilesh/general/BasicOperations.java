package nilesh.general;

public class BasicOperations {
    public static void main (String args[]) {
        System.out.println("Hello World");
        BasicOperations basic = new BasicOperations();
        basic.TraverseArray();

        //For loop
//        for(int counter=1; counter<10; counter++){
//            System.out.println(counter);
//        }

//        for(int i=0; i<11; i++){
//            System.out.println(i);
//        }

        //While loop
//        int i = 0;
//        while(i<10){
//            System.out.println(i);
//            i = i + 1;
//        }

//        int i = 13;
//        while(i < 11){
//            System.out.println("My Life My Rules");  //while execute if condition is true
//        }

        //do-while loop
//        int i = 5;
//        do{
//            System.out.println(i);
//            i = i + 1;
//        }while(i < 11);

//        do{
//            System.out.println("My Life My Rules");
//            i++;                        //do-while loop will execute once before checking the condition
//        } while(i<15);
    }

    public void TraverseArray(){
        int[] array = {4, 5, 8, 10, 48, 78, 96};  //Declared an array
        for(int i=0; i<array.length; i++){
            System.out.println("Value of position of array" +i+ " is "+array[i]);
        }
    }
}
