import java.util.*;

public class crossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length();
        // int i = 0;
        // int j = s.length()-1;
        
        for(int i = 0; i<n; i++){
            int j = n-1-i;
            for(int k = 0; k<n; k++){
                if(k == i || k == j){
                    System.out.print(s.charAt(k));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // int space = j-i-1;
        // String spc = new String();

        // for(int k = 0; i<space; i++){
        //     spc+=" ";
        // }
        // while(i!=j){
        //     System.out.println(s.charAt(i) + spc + s.charAt(j));
        //     i++;
        //     j--;
        // }
    }
}
