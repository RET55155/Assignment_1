public class PowerF_6 {
    public static long calcPower(int Number, int power) {
        if (power == 0) {
            return 1;
        }
        return Number * calcPower(Number, power - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        long result = calcPower(a, n);
        System.out.println(a + "power" + result);
    }
}