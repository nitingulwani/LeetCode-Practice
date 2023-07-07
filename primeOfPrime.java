import java.util.ArrayList;
import java.util.List;

public class primeOfPrime {
    public static void main(String[] args) {
        int start = 2;
        int end = 100;

        List<Integer> primeOfPrimes = primeOfPrimeNumbers(start, end);

        System.out.println("Prime of Prime Numbers between " + start + " and " + end + ":");
        System.out.println(primeOfPrimes);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOfPrime(int n) {
        if (!isPrime(n)) {
            return false;
        }
        int sumOfDigits = 0;
        int num = n;
        while (num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }
        return isPrime(sumOfDigits);
    }

    public static List<Integer> primeOfPrimeNumbers(int start, int end) {
        List<Integer> primeOfPrimes = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPrimeOfPrime(num)) {
                primeOfPrimes.add(num);
            }
        }
        return primeOfPrimes;
    }
}