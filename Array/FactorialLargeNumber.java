import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialLargeNumber {

    static void factorialLargeNumber(int n) {
        int res[] = new int[500];

        res[0] = 1;
        int res_size = 1;

        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);

        System.out.println("Factorial of given number is ");
        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = res_size - 1; i >= 0; i--)
            list.add(res[i]);
    }

    static int multiply(int x, int res[], int res_size) {
        int carry = 0;

        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }

    static BigInteger factorialLarge(int N) {
        BigInteger f = new BigInteger("1");

        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }

    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        // System.out.println(factorialLarge(5));
        factorialLargeNumber(5);

    }

}
