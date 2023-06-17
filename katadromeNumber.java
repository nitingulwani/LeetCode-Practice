import java.util.*;

public class katadromeNumber {
    public static boolean katadrome(int n){
        String s = Integer.toString(n);
        for(int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i + 1) >= s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = katadrome(n);
        System.out.println(result);
    }
}
