package nilesh.array;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = {21, 25, 89, 85, 57, 19, 84, 64, 102};

        int results = FindSecondLargestElement(arr);

        System.out.println("The Second Largest element is: " +results);
    }

    public static int FindSecondLargestElement(int[] arr){

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for( int i = 0; i < arr.length; i++){

            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }

        return secondlargest;
    }
}
