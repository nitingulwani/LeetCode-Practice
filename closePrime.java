import java.util.*;
    public class closePrime {
        public static boolean isPrime(int n){
            
            int c = 0;
            for(int i = 1; i<=n; i++){
                if(n%i == 0){
                    c++;
                }
            }
            if(c==2) return true;
            else return false;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int diff1 = 0, diff2 = 0;
            int num1 = 0, num2 = 0;
            
            for(int i = n;; i++){
                if(isPrime(i)){
                    diff1 = i-n;
                    num1 = i;
                    break;
                }
            }
            for(int i = n;; i--){
                if(isPrime(i)){
                    diff2 = n-i;
                    num2 = i;
                    break;
                }
            }
            
            if(diff1<=diff2){
                System.out.println(num1);
            }
            else{
                System.out.println(num2);
            }
            
        }
    }
