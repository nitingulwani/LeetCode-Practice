import java.util.*;

public class trendyNumber {
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int middle = (n/10) % 10;

        if(middle%3 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
