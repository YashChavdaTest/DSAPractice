package nilesh.array;
import java.util.HashMap;
import static yash.array.TwoSumProblem.TwoSum;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] array = {21,4,5,7,9,56,78,45,73,46,24};
        int target = 70;

        int[] result = TwoSum(array,target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] TwoSum(int[] array,int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<array.length; i++) {

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
