import java.util.Scanner;
import java.lang.*;

public class binaryString {
    public static boolean equalStrings(String s1, String s2){
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == '0'){
                c1+=1;
            }
            if(s1.charAt(i) == '1'){
                c2+=1;
            }
        }
        for(int i = 0; i<s2.length(); i++){
            if(s2.charAt(i) == '0'){
                c3+=1;
            }
            if(s2.charAt(i) == '1'){
                c4+=1;
            }
        }
        if(s1.length() == s2.length() && c1 == c3 && c2 == c4){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean result = equalStrings(s1, s2);
        if(result == true){
            System.out.println("there is a possibility");
        }
        else{
            System.out.println("Impossible");
        }
        // System.out.println(result);
    }
}

