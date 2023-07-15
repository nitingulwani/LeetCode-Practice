
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : s.toCharArray()) {
                uniqueChars.add(c);
            }
            return uniqueChars.size() < s.length();
        }

        List<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffs.add(i);
            }
        }

        return diffs.size() == 2 && s.charAt(diffs.get(0)) == goal.charAt(diffs.get(1))
                && s.charAt(diffs.get(1)) == goal.charAt(diffs.get(0));
    }
}


// class Solution{
//     public boolean buddyStrings(String s, String goal){
//         if(s.length() != goal.length()) return false;

//         if(s.equals(goal)){
//             HashSet<Character> unique_chars = new HashSet<>();
//             for(char c : s.toCharArray()){
//                 unique_chars.add(c);
//             }

//             if(unique_chars.size() == s.length()){
//                 return true;
//             }
//             else{
//                 return false;
//             }
//         }

//         List<Integer> diff = new ArrayList<>();
//         for(int i = 0; i<s.length(); i++){
//             if(s.charAt(i) != goal.charAt(i)){
//                 diff.add(i);
//             }
//         }

//         if(diff.size() == 2 && 
//         s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) && 
//         goal.charAt(diff.get(0)) == s.charAt(diff.get(1))){
//             return true;
//         }
//         else{
//             return false;
//         }

//     }
// }


// //35/39 cases pass

// // class Solution {
// //     public boolean buddyStrings(String s, String goal) {
// //         // ArrayList<Integer> list = new ArrayList<>();
        
// //         int[] arr = new int[s.length()];

// //         if(s.length() != goal.length()) return false;
// //         int count = 0;

// //         for(int i = 0; i<s.length(); i++){
// //             int val = Math.abs(s.charAt(i) - goal.charAt(i));
// //             arr[i] = val;
// //             if(val != 0){
// //                 count += 1;
// //             }
// //         }

// //          if (s.equals(goal)) {
// //             // If we have 2 same characters in string 's',
// //             // we can swap them and still the strings will remain equal.
// //             int[] frequency = new int[26];
// //             for (char ch : s.toCharArray()) {
// //                 frequency[ch - 'a'] += 1;
// //                 if (frequency[ch - 'a'] == 2) {
// //                     return true;
// //                 }
// //             }
// //             // Otherwise, if we swap any two characters, it will make the strings unequal.
// //             return false;
// //         }

// //         if(count != 2) return false;

// //         int[] ans = new int[2];

// //         for (int i = 0, j = 0; i < arr.length; i++) {
// //             if (arr[i] != 0) {
// //                 ans[j] = arr[i];
// //                 j++;
// //             }
// //         }

// //         if(ans[0] == ans[1]){
// //             return true;
// //         } 
// //         else{
// //             return false;
// //         }
// //     }
// // }
