package leetcode;

public class l3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int[] arr = new int[300];
        int i=0,j=1,mmax=1,dem=1;
        arr[s.charAt(0)] = 1;
        while(i<j && j<s.length()) {
            if(arr[s.charAt(j)] >i){
                // bi lap trong khoang i -> j
                i = arr[s.charAt(j)];
                dem=j-i+1;
            } else {
                dem++;
            }
            arr[s.charAt(j)]=j+1;
            j++;
            if(dem>mmax) mmax = dem;
        }
        return mmax;
    }
}
