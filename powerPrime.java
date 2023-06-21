import java.util.*;
import java.lang.Math;
public class LargestPowerOfPrime {

    static int k=1;
    public static int LargestPower(int n, int prime){

        int power = 0;
        while (n > 0) {
            n /= prime;
            power += n;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter prime");
        int prime = sc.nextInt();
        int res= LargestPower(n,prime);
        System.out.println(res);
    }
}