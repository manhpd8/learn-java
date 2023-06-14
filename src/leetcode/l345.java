package leetcode;

import java.util.List;

public class l345 {
    public String reverseVowels(String s) {
        int lft=0,rgh=s.length()-1;
        String vowels="ueoaiUEOAI";
        char[] result = s.toCharArray();
        while(lft<rgh){
            while(lft<rgh && vowels.indexOf(s.charAt(lft)) <0){
                lft++;
            }
            while (lft<rgh && vowels.indexOf(s.charAt(rgh)) <0){
                rgh--;
            }
            if(lft<rgh){
                result[lft] = s.charAt(rgh);
                result[rgh] = s.charAt(lft);
            }
            lft++;
            rgh--;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        l345 ins = new l345();
        System.out.println(ins.reverseVowels("leetcode"));
    }
}
