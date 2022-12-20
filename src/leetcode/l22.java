package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l22 {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        ve(0,0,"",n);
        return result;
    }

    public void ve(int d, int m, String s,int n){
        if(d ==n) {
            result.add(s);
//            System.out.println(s);
        }
        if(m==n){
            while(d<n){
                s+=")";
                d++;
            }
            result.add(s);
//            System.out.println(s);
            return;
        }
        if(m> d){
            //vua dong mo
            ve(d+1,m,s+")",n);
            ve(d,m+1,s+"(",n);
        }
        if(m==d){
            ve(d,m+1,s+"(",n);
        }
    }
}
