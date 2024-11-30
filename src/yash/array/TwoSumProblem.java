package yash.array;

import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String args[]){
        int[] array={1,3,63,14,2,89,35,57,234,5345,346,456,243,34,234,24,234,234,234,234,234,23,412,312,3,123,12,3,123};
        int target = 38;
        int[] result = TwoSum(array,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] TwoSum(int[] array,int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<array.length;i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                // If it exists, return the indices
                return new int[] { map.get(complement), i };
            }
            map.put(array[i], i);

        }
        throw new IllegalArgumentException("No solution found!");
    }
}
