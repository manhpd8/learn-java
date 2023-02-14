package leetcode;

public class l326 {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        if(n==1) return true;
        for(int i=1;i<20;i++){
            int luythua = (int) Math.pow(3,i);
            if(luythua >n) return false;
            if(luythua ==n) return true;
        }
        return false;
    }
}
