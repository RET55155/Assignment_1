import java.util.Scanner;
public class Reverse_Output_7 {
    private static Scanner sc = new Scanner(System.in);

    public static void reverseOutput(int n) {
        if (n == 0) {
            return;
        }
        int currentNum = sc.nextInt();
        reverseOutput(n - 1);
        System.out.print(currentNum + " ");
    }

    public static void main(String[] args) {
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            reverseOutput(n);
        }
    }
}
