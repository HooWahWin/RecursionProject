public class Fibonacci {

    public static long recursiveFib(int n) {
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        } else {
            return (recursiveFib(n - 1) + recursiveFib(n - 2));
        }
    }

    public static long iterativeFib(int n) {
        long older = 0;
        long old = 1;
        long newvalue = 0;
        for (int i = 1; i < n; i++) {
            newvalue = old + older;
            older = old;
            old = newvalue;
        }
        return newvalue;
    }
}
