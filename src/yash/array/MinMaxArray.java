package yash.array;

public class MinMaxArray {
    static int[] array={145,323,63,14,2,89,35,57,234,5345,346,456,243,34,234,24,234,234,234,234,234,23,412,312,3,123,12,3,123};
    public static void main(String args[]){
        int[] resultArray=MinMax(array);
        for(int i=0;i<resultArray.length;i++) {
            System.out.println(resultArray[i]);
        }
    }
    public static int[] MinMax(int[] array){
        int Max=array[0];
        int Min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>Max){
                Max=array[i];
            }
            else if(array[i]<Min) {
                Min = array[i];
            }
        }
        return new int[]{Min,Max};
    }
}
