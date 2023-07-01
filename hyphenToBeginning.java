import java.util.Scanner;
import java.util.Stack;

public class hyphenToBeginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '-'){
                count+=1;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<count; i++){
            sb.append("-");
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println(sb.toString());
    }
}
