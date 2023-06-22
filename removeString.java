import java.util.*;

public class removeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String ans = "";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s1.length(); i++) {
            st.push(s1.charAt(i));
            for (int j = 0; j < s2.length(); j++) {  // Corrected loop condition
                if (!st.isEmpty() && st.peek() == s2.charAt(j)) {
                    st.pop();
                }
            }
        }

        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        System.out.println(ans);
    }
}

