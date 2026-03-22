public class Prime_3 {
    public static String isPrime(int n, int divisor) {
        if (n <= 2) {
            return (n == 2) ? "Prime" : "Composite";
        }
        if (n % divisor == 0) {
            return "Composite";
        }
        if (divisor * divisor > n) {
            return "Prime";
        }
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        int testNum = 7;
        String result = isPrime(testNum, 2);
        System.out.println(testNum + " is " + result);
    }
}