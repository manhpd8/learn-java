package leetcode;

public class l5Z_version2 {
    public String longestPalindrome(String s) {
        char[] ch = prepareStr(s);
        int[] p = new int[ch.length]; // defaul =0
        // lay i lam tam
        int center=0,right=0;//tam va right dang lon nhat
        for(int i=1;i<ch.length;i++){
            if(right>i){ // ko phai xet lai cac xau con nam trong da doi xung
                int mirror = 2*center -i;// gia tri p doi xung qua tam center
                p[i] = Math.min(right-i, p[mirror]);
            }
            while((i+p[i]<s.length()) && (i-p[i] > 0) && (ch[i+p[i]] == ch[i-p[i]])) {
                p[i]++;
            }
            if(i+p[i]>right) {
                right=i+p[i];
                center =i;
            }
        }

        return "";
    }

    public char[] prepareStr(String s) {
        char[] result = new char[s.length() * 2 + 2];
        result[0] = '$';
        result[2 * s.length() + 1] = '@';
        for (int i = 0; i < s.length(); i++) {
            result[i * 2 + 1] = '#';
            result[i * 2 + 2] = s.charAt(i);
        }
        return result;
    }
}
