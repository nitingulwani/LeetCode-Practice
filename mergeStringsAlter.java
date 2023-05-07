class mergeStringsAlter {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();

        // String ans = new String();
        String ans = "";

        int i = 0, j = 0;

        while(l1>0 && l2>0){
            ans+=word1.charAt(i);
            ans+=word2.charAt(j);
            i++;
            j++;
            l1--;
            l2--;
        }
        while(l1>0){
            ans+=word1.charAt(i);
            i++;
            l1--;
        }

        while(l2>0){
            ans+=word2.charAt(j);
            j++;
            l2--;
        }
        return ans;

    }
}