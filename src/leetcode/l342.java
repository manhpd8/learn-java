package leetcode;

public class l342 {
    public boolean isPowerOfFour(int n) {
        if(n<0) return false;
        int x=1;
        while (x*x<=n){
            if(x==0) return false;
            if(x*x==n) return true;
            x <<=1;
        }
        return false;
    }

    public static void main(String[] args) {
        l342 ins = new l342();
        System.out.println(ins.isPowerOfFour(1162261466));
    }
}
