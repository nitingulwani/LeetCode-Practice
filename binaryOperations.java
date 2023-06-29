//Accenture Question
// i/p = 1C0C1A0B1
// o/p = 1

import java.util.*;

public class binaryOperations {
    public static int binarySolve(String s){
        int ele = s.charAt(0) - '0';
        for(int i = 1; i<s.length()-1; i+=2){
            int j = i+1;
            if(s.charAt(i) == 'A'){
                ele = ele & (s.charAt(j) - '0');
            }
            else if(s.charAt(i) == 'B'){
                ele = ele | (s.charAt(j) - '0');
            }
            else if(s.charAt(i) == 'C'){
                ele = ele ^ (s.charAt(j) - '0');
            }
        }
        return ele;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = binarySolve(s);
        System.out.println(result);
    }
}
