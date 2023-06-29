import java.util.*;

public class equibilibriumPoint {
    public static int equiP(int[] arr, int n){
        int left = 0;
        int right = n-1;
        int lSum = 0;
        int rSum = 0;
        
        while(left<right){
            if(arr[left] < arr[right] && arr[left] != arr[right] && lSum != rSum){
                lSum += arr[left];
                rSum += arr[right];
                left++;
            }
            else if(arr[left] > arr[right] && arr[left] != arr[right] && lSum != rSum){
                lSum += arr[left];
                rSum += arr[right];
                right--;
            }
        }
        return left+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = equiP(arr, n);
        System.out.println(result);

        
    }
}
