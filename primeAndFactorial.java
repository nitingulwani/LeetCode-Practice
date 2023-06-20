import java.util.*;

public class primeAndFactorial {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        list.add(n);
        return true;
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int fact = factorial(i);
                System.out.println("Factorial of the prime number " + i + " is " + fact);
            }
        }
    }
}
