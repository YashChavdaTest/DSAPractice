package yash.array;

public class BasicOperations{
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6};
        BasicOperations b1 = new BasicOperations();
        b1.TraverseArray(array);
        int[] reversedArray= b1.ReverseArray(array);
        b1.TraverseArray(reversedArray);
    }

    public void TraverseArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Value of array at position: "+i+ " is "+array[i]);
        }
    }

    public int[] ReverseArray(int[] array){
        int[] arrayReverse = new int[array.length];
        for(int i=0;i<array.length;i++) {
            arrayReverse[i] = array[array.length - 1 -i];
        }
        return arrayReverse;
    }
}