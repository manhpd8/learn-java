package leetcode;

import java.util.List;
import java.util.Stack;

public class l20 {
    public boolean isValid(String s) {
        List<Character> mon = List.of('(','{','[');
        if(!mon.contains(s.charAt(0))) return false;
        Stack<Character> ss = new Stack<>();
        ss.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(mon.contains(s.charAt(i))) {
                //mo ngoac thi cu cho vao stack
                ss.push(s.charAt(i));
            } else {
                //dong ngoac thi phai kiem tra
                if(ss.isEmpty()) return false;
                Character lastC = ss.lastElement();
                //neu la mo ngoac phai k.tra xemm co cung loai ko
                if(s.charAt(i)==')' && lastC=='(') {
                    ss.pop();
                    continue;
                }
                if(s.charAt(i)=='}' && lastC=='{') {
                    ss.pop();
                    continue;
                }
                if(s.charAt(i)==']' && lastC=='[') {
                    ss.pop();
                    continue;
                }
                return false;
            }
        }
        if(ss.isEmpty()) return true;
        return false;
    }
}
