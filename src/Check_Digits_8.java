public class Check_Digits_8 {
    public static boolean isDigitsOnly(String s) {
        if (s.isEmpty()) return true;
        char first = s.charAt(0);
        if (!Character.isDigit(first)) {
            return false;
        }
        return isDigitsOnly(s.substring(1));
    }

    public static void main(String[] args) {
        String test = "123456";
        System.out.println("This contains only digits? " +
                (isDigitsOnly(test) ? "Yes" : "No"));
    }
}
