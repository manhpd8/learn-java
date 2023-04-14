package leetcode;

public class l58 {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        while (n>=0 && s.charAt(n) == ' ') n--;
        int dem=0;
        while (n>=0 && s.charAt(n) !=' ') {
            n--;
            dem++;
        }
        return dem;
    }
}
