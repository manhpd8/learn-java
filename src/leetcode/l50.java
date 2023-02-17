package leetcode;

import java.util.HashMap;

public class l50 {
    long dem=0;
    HashMap<Long, Double> storeV = new HashMap<>();
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(x==1) return 1;
        long n2=n;
        if(n<0) n2=-n2;
        double lt= luythua(x,n2);
        if(n<0) return 1/lt;
        System.out.println(dem);
        return lt;
    }

    double luythua(double x, long n){
        if(storeV.containsKey(n)) return storeV.get(n);
        dem++;
        if(n==1) {
            storeV.put(1l,x);
            return x;
        }
        Double result = luythua(x,n/2)*luythua(x,n-n/2);
        storeV.put(n,result);
        return result;
    }

    public static void main(String[] args) {
        l50 ins = new l50();
        System.out.printf(ins.myPow(0.00001,-2147483648)+"");
    }
}
