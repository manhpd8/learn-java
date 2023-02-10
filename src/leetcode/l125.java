package leetcode;

public class l125 {
    public boolean isPalindrome(String s) {

        String s1 = s.replaceAll("[\\W_]","").toLowerCase();
        System.out.println(s1);
        int l=0,r=s1.length()-1;
        while(l<r){
            if(s1.charAt(l) != s1.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
}
