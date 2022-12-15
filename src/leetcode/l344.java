package leetcode;

public class l344 {
    public void reverseString(char[] s) {
        char c;
        int n = s.length;
        int mid=n/2;
        if(n%2==0) mid--;
        for(int i=0;i<=mid;i++){
            c = s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=c;
        }
        System.out.println(String.copyValueOf(s));
    }
}
