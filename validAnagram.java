
class Solution {
    public boolean isAnagram(String s, String t) {
        //ulta 9% hi aara hai 
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) -1);
        }

        for(char match : map.keySet()){
            if(map.get(match) != 0){
                return false;
            }
        }
        return true;
        //Hashset se not possible - repeated elements ki dikkat hogi

        // HashSet<Character> set = new HashSet<>();

        // s = s.toLowerCase();
        // t = t.toLowerCase();

        // for(int i = 0; i<s.length(); i++){
        //     set.add(s.charAt(i));
        // }

        // for(int i = 0; i<t.length(); i++){
        //     if(set.contains(s.charAt(i))) return true;
        //     else{
        //         return false;
        //     }
        // }


        //37% beats

        // if(s.length() == t.length()){
        //     char[] arr1 = s.toCharArray();
        //     char[] arr2 = t.toCharArray();

        //     Arrays.sort(arr1);
        //     Arrays.sort(arr2);
        //     int count = 0;

        //     for(int i = 0; i<s.length(); i++){
        //         if(arr1[i] == arr2[i]){
        //             count+=1;
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        //     if(count == s.length()) return true;

        // }
        // return false;
    }
}
