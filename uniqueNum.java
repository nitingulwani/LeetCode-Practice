import java.util.*;

public class uniqueNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        String s = Long.toString(n);
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i<s.length(); i++){
            set.add(s.charAt(i));
        }

        if(set.size() < s.length()){
            System.out.println("Not Unique");
        }
        else if(set.size() == s.length()){
            System.out.println("unique");
        }

    }
}
