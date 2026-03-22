import java.util.Scanner;
public class Reverse_Output_7 {
    public static void reverseInput() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            return;
        }
        reverseInput();
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        System.out.println("Enter numbers,end with 0: ");
        reverseInput();
    }
}