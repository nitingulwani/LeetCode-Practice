import java.util.*;

public class shoppingTime {
    public static int[] shopping(int[] nums, int n){
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i<nums.length; i++){
            q.add(nums[i]);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int maxItems = sc.nextInt();

    }
}
