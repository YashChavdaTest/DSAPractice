package nilesh.array;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;
        PrintFibonacciSeries(n);
    }

    public static void PrintFibonacciSeries(int n) {
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);

            first = second;
            second = next;
        }
        System.out.println();
    }
}
