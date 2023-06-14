package leetcode;

public class l231 {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return true;
        if(n<0) return false;
        int m=1;
        while (m<=n){
            if(m==0) return false;
            if(m==n) return true;
            m<<=1;
        }
        return false;
    }

    public static void main(String[] args) {
        l231 ins = new l231();
        System.out.println(ins.isPowerOfTwo(1073741825));
    }
}
