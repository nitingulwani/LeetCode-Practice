import java.util.Scanner;

public class inverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] inverseArr = new int[n];

        for (int i = 0; i < n; i++) {
            int x = arr[i];
            inverseArr[x] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(inverseArr[i] + " ");
        }
    }
}
