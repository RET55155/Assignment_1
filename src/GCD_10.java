public class GCD_10 {
    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        int a = 32, b = 48;
        System.out.println("GCD(" + a + ", " + b + ") = " + findGCD(a, b));
    }
}