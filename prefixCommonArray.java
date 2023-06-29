//Beats - 65%
class prefixCommonArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            if (set.contains(A[i])) {
                count++;
            }
            if (set.contains(B[i])) {
                count++;
            }
            if (A[i] == B[i]) {
                count++;
            }
            arr.add(count);
            if (i > 0) {
                arr.set(i, arr.get(i - 1) + count); 
            }
            set.add(A[i]);
            set.add(B[i]);
        }

        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}

// //beats - 40%
// class Solution {
//     public int[] findThePrefixCommonArray(int[] A, int[] B) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();

//         for (int i = 0; i < A.length; i++) {
//             int count = 0;
//             if (set.contains(A[i])) {
//                 count++;
//             }
//             if (set.contains(B[i])) {
//                 count++;
//             }
//             if (A[i] == B[i]) {
//                 count++;
//             }
//             arr.add(count);
//             if (i > 0) {
//                 arr.set(i, arr.get(i - 1) + count); 
//             }
//             set.add(A[i]);
//             set.add(B[i]);
//         }

//         int[] ans = new int[arr.size()];
//         for (int i = 0; i < arr.size(); i++) {
//             ans[i] = arr.get(i);
//         }
//         return ans;
//     }
// }
