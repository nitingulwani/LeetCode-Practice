import java.util.Scanner;

public class swap4bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        if(n == 0){
            System.out.println("0");
        }
        while(n>0){
            int rem = n%2;
            sb.append(rem);
            n/=2;
        }
        String s = sb.reverse().toString();
        String one = new String();
        String two = new String();

        for(int i = 0; i<s.length()/2; i++){
         
            one+=s.charAt(i);
        }
        for(int i = s.length()/2; i<s.length(); i++){
           
            two+=s.charAt(i);
        }

        String ans = two+one;
        
        System.out.println(ans);
    }
}
