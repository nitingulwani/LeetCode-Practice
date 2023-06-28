import java.util.*;

public class smallLargeSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                odd.add(arr[i]);
            } else {
                even.add(arr[i]);
            }
        }

        Collections.sort(odd);
        Collections.sort(even);

        int sum = odd.get(odd.size() - 2) + even.get(even.size() - 2);

        System.out.println(sum);
    }
}