package nilesh.array;

public class ThirdLargestElement {

    public static void main(String[] args) {

        int[] array = {21, 56, 89, 802, 520, 59, 62, 52, 56};

        int results = FindThirdLargestElement(array);

        System.out.println("The Third largest element is: " +results);
    }

    public static int FindThirdLargestElement(int[] array){

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){

            if(array[i] > largest){

                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = array[i];
            }

            else if (array[i] > secondlargest && array[i] != largest) {
                thirdlargest = secondlargest;
                secondlargest = array[i];

            } else if (array[i] > thirdlargest && array[i] != largest) {
                thirdlargest = array[i];
            }

            if(array.length < 3){
                throw new IllegalArgumentException("Array must have at least 3 elements");
            }
        }

        return thirdlargest;
    }
}
