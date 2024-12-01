package nilesh.array;

public class BasicOperations {
    public static void main (String args[]) {
        System.out.println("Hello World");
        BasicOperations basic = new BasicOperations();
        basic.TraverseArray();
    }

    public void TraverseArray(){
        int[] array = {4, 5, 8, 10, 48, 78, 96};  //Declared an array
        for(int i=0; i<array.length; i++){
            System.out.println("Value of position of array" +i+ " is "+array[i]);
        }
    }
}
