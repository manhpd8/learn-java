package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l131 {
    static String SYM = "#";
    public List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        StringBuilder sBuilder =  new StringBuilder();
        for(int i=0;i<s.length();i++) sBuilder.append(s.charAt(i)).append(SYM);
        s = sBuilder.toString();
        for(int i=0;i<s.length();i++){
            lists.add(genPalindrome(s,i));
        }
        lists.removeIf(e -> e.size()==0);
        return lists;
    }

    List<String> genPalindrome(String s, int r) {
        List<String> result = new ArrayList<>();
        int l=r;
        while (l>=0 && r<s.length()) {
            String str = s.substring(l,r+1);
            if(isPalindrome(str)) {
                // add to list
                if(!SYM.equals(str)) {
                    result.add(genPalindrome(str));
                }
                l--;
                r++;
            } else {
                break;
            }
        }
        result.removeIf(e -> e==null);
        return result;
    }

    Boolean isPalindrome(String s) {

        String reserveS = new StringBuilder(s).reverse().toString();
        return s.equals(reserveS);
    }

    String genPalindrome(String s) {
        if(SYM.equals(s.charAt(0)) && SYM.equals(s.charAt(s.length()-1))) return null;
        return s.replaceAll(SYM,"");
    }

    public static void main(String[] args) {
        String s ="aab";
        // a#a#b#
        l131 ins = new l131();
        System.out.println(ins.partition(s));
    }
}
