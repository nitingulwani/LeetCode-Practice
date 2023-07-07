import java.util.*;

public class countFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        int totalCount = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            totalCount += entry.getValue();
        }

        int[] resultArray = new int[totalCount];
        int index = 0;
         
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int frequency = entry.getValue();
            int element = entry.getKey();
            for (int i = 0; i < frequency; i++) {
                resultArray[index] = element;
                index++;
            }
        }

        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}
