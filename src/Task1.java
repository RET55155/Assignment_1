public class Task1 {
    public static void OneDigit(int a) {
        if (a < 10) {
            System.out.println(a);
            return;
        }
        OneDigit(a / 10);
        System.out.println(a % 10);
    }

    public static void main(String[] args) {
        int testInput = 5481;
        System.out.println("result: " + testInput );
        OneDigit(testInput);
    }
}