package leetcode;

public class l7 {
    public int reverse(int x) {
        boolean positive = x>=0;
        StringBuilder strX = new StringBuilder().append(Math.abs(x));
        try {
            if(positive) return Integer.parseInt(strX.reverse().toString());
            else  return 0-Integer.parseInt(strX.reverse().toString());
        } catch (Exception e) {
            return 0;
        }
    }
}
