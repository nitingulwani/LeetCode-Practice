import java.util.Arrays;
import java.util.Scanner;

public class maxSubsetProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int subSize = sc.nextInt();

        int numSubsets = n / subSize;
        int pro[] = new int[numSubsets];

        for (int i = 0; i < numSubsets; i++) {
            int prod = 1;
            for (int j = i * subSize; j < (i * subSize) + subSize && j < n; j++) {
                prod *= arr[j];
            }
            pro[i] = prod;
        }

        Arrays.sort(pro);

        System.out.println(pro[numSubsets - 1]);
    }
}