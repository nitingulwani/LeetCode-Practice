public class lettergrterthntarget744 {
    public char nextGreatestLetter(char[] letters, char target) {
        
        char ans = letters[0];
        int left = 0;
        int right = letters.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(letters[mid] == target){
                left = mid+1;
            }
            else if(letters[mid]<target){
                left = mid+1;
            }
            else{
                ans = letters[mid];
                right=mid-1;
            }
        }
        return ans;
    }
}