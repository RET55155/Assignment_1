public class Average_2 {
    public static double Sum(int[] data, int index) {
        if (index == data.length - 1) {
            return data[index];
        }
        return data[index] + Sum(data, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 2, 3, 4, 1};
        int n = numbers.length;
        double totalSum = Sum(numbers, 0);
        double average = totalSum / n;

        System.out.println("fverage: " + average);
    }
}