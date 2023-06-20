//find the largest power of prime which divides n!

import java.util.*;

public class powerPrime {
    static int k;

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    static double power(double prime, int k) {
        double pow = 1;
        for (int i = 1; i <= k; i++) {
            pow *= prime;
        }
        return pow;
    }

    public static int factbypowerPrime(int n, int prime) {
        k = 0;
        while (factorial(n) % power(prime, k) == 0) {
            k++;
        }
        return k - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = sc.nextInt();
        int result = factbypowerPrime(n, prime);
        System.out.println(result);
    }

}
