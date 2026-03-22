public class fibonacci_5 {
    public static int CreateFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return CreateFibonacci(n - 1) + CreateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int index = 7;
        System.out.println("Fibonacci is: " + CreateFibonacci(index));
    }
}