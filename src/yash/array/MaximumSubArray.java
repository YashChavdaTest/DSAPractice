package yash.array;

import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String args[]){
        int[] array={-21,-4,5,4,-31,-3,-10};
        int[] result=MaxSubArray(array);
        for(int i=0;i<=result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] MaxSubArray(int[] array){
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int tempStart=0;
        for(int i=0;i<array.length;i++){
            current_sum = current_sum + array[i];
            if(current_sum>max_sum){
                max_sum = current_sum;
                start = tempStart;
                end = i;
            }

            if(current_sum<0){
                current_sum=0;
                tempStart = i+1;
            }

        }
        System.out.println("Subarray: " + Arrays.toString(Arrays.copyOfRange(array, start, end + 1)));
        return null;
    }
}
