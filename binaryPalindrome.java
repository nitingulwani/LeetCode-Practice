import java.util.Scanner;

public class binaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);

        int left = 0;
        int right = s.length() - 1;
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println(false);
            }
            left++;
            right--;
        }
        System.out.println(true);
  
    }

}

