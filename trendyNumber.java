// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class trendyNumber {
    public static boolean trendyNum(int n){
        int middle = (n/10) % 10;

        if(middle%3 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = trendyNum(n);
        System.out.println(result);
    }
}
