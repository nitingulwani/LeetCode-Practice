import java.util.Scanner;
import java.lang.*;

public class automorphicNum {
    public static boolean isAutomorphic(int n){
        if(n<10 && n>0){
            int square = n*n;
            if(square%10 == n){
                return true;
            }
        }
        return false;
 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isAutomorphic(n);
        System.out.println(result);
    }
}
