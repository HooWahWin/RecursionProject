//Name: Hoa Nguyen
//LSU ID: 896317475

public class Fibonacci {

    public static long recursiveFib(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }
        return (recursiveFib(n - 1) + recursiveFib(n - 2));
    }

    public static long iterativeFib(int n) {
        long olderValue = 0;
        long oldValue = 1;
        long newValue = 0;
        for (int i = 1; i < n; i++) {
            newValue = oldValue + olderValue;
            olderValue = oldValue;
            oldValue = newValue;
        }
        return newValue;
    }
}
