package leetcode;

import java.util.Arrays;

public class l5 {
    public String longestPalindrome(String s) {
        char[] ch = prepareStr(s);
        int[] p = new int[ch.length];
        Arrays.fill(p,1);
        int center = 0, right = 0,mmax=0;
        for (int i = 1; i < ch.length - 1; i++) {
            int mirror = 2 * center - i;
            if (right > i) {
                p[i] = Math.min(right - i, p[mirror]);
            }
            while ((i+p[i]<ch.length) && (i-p[i] > 0) && (ch[i + (0 + p[i])] == ch[i - (0 + p[i])])) {
                p[i]++;
            }
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
            if(p[i]==p[mmax] && ch[i]!='#') {
                if(printStr(ch,i,p[i]).length() > printStr(ch,mmax,p[mmax]).length()) mmax=i;
            }
            if(p[i]>p[mmax]) mmax=i;
        }
        return printStr(ch,mmax,p[mmax]);
    }

    public char[] prepareStr(String s) {
        char[] result = new char[s.length() * 2+1];
        result[0] = '#';
//        result[2 * s.length() + 2] = '@';
        for (int i = 0; i < s.length(); i++) {
            result[i * 2 + 2] = '#';
            result[i * 2 + 1] = s.charAt(i);
        }
        return result;
    }
    //#1#2#3#3#2#1#

   public String printStr(char[] ch, int mmax, int pmmax){
       String result = String.copyValueOf(ch,mmax-pmmax+1, pmmax*2-1);
       return result.replaceAll("#","");
   }
}
