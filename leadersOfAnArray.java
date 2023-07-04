import java.util.*;

public class leadersOfAnArray {
    static ArrayList<Integer> leaders(int arr[], int n){
       
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        ans.add(st.peek());
        for(int i = arr.length-2; i>=0; i--){
            if(st.peek() <= arr[i]){
                st.pop();
                st.push(arr[i]);
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(leaders(arr, n));
    }
}
