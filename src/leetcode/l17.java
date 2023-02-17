package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l17 {
    String[] lt = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    String digits;
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return result;
        this.digits = digits;
        gen("",0);
        return result;
    }
    void gen(String str, int index){
        if(str.length() == digits.length()) {
            result.add(str);
            return;
        }
        String letters = lt[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            gen(str + letters.charAt(i), index+1);
        }
    }

    public static void main(String[] args) {
        l17 ins = new l17();
        System.out.println(ins.letterCombinations("23"));
    }
}
