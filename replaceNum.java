
import java.util.Scanner;

public class replaceNum {
    public static int replace(int num) {
        int ans = 0;
        int rem = 0;
        int i = 0;
        
        if(num<0) return -1;
        if(num>1000000) System.out.println("Wrong Input");
        
        while (num>0 && num<=1000000) {
            rem = num % 10;
            ans = ans + (9 - rem) * (int) Math.pow(10, i++);
            num = num / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = replace(num);
        System.out.println(result);
    }
}

