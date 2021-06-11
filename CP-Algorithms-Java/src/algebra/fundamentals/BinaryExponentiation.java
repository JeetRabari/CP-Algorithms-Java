package algebra.fundamentals;

public class BinaryExponentiation {
    public static void main(String[] args) {
        long a;
        long b;

        a = 300;
        b = 2;
        System.out.println(binPowRecursive(a, b));
    }

    // calculate a^b using binary exponentiation
    public static long binPowRecursive(long a, long b) {
        if (b == 0)
            return 1L;

        long temp = binPowRecursive(a, b / 2);

        if (b % 2 == 0) {
            return temp * temp;
        } else {
            return a * temp * temp;
        }
    }
}
