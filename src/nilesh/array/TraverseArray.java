package nilesh.array;

public class TraverseArray {
    public static void main (String arg[]) {
        System.out.println("Hello World");
        TraverseArray basic = new TraverseArray();
        basic.TraverseArray();
    }

    public void TraverseArray(){
        int[] array = {4, 5, 8, 10, 48, 78, 96};  //Declared an array here

        for(int i=0; i<array.length; i++){
            System.out.println("Value of position of array" +i+ " is "+array[i]);

        }

    }

}
