public class Factorial_4 {
    public static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial: " + Factorial(num));
    }
}