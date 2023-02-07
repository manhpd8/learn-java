package leetcode;

public class l69 {
    public int mySqrt(int x) {
        if(x==0) return 0;
        if(x<=3) return 1;
        long i=2;
        while(i*i<=x) i++;
        return (int) (i-1);
    }


}
