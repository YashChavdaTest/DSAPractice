package yash.array;

public class BasicOperations{
    public static void main(String args[]){
        System.out.println("Hello World");
        BasicOperations b1 = new BasicOperations();
        b1.TraverseArray();
    }

    public void TraverseArray(){
        int[] array2 = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<array2.length;i++){
            System.out.println("Value of array at position: "+i+ " is "+array2[i]);
        }
    }
}