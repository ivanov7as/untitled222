public class untitled222 {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 200));
        isPositiveOrNegative(10);
        System.out.println(isNegative(5));
        printWordNTimes("stroka", 10);
        System.out.println(leapYear(2000)); // Task 5*
    }
    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(word);
        }
    }
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
