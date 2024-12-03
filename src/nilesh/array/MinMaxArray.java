package nilesh.array;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {21, 42, 8, 6, 52, -65, 85, 21, 5};

        int[] result = FindMinMax(arr);

        System.out.println("Minimum element of array is " +result[0]);
        System.out.println("Maximun element of array is " +result[1]);
    }

    public static int[] FindMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }
}
