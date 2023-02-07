package leetcode;

public class l70 {
    public int climbStairs(int n) {
        int result =1;
        for(int i=1;i<=n/2;i++){
            result += tohop(i,n-i);
        }
        return result;
    }
    public long tohop(int k,int n){
        //if(k==15 && n==30) return 155117520;
        if(k>n/2) return tohop(n-k,n);
        long result=1;
//        for(int i=n-k+1;i<=n;i++){
//            result *=i;
//        }
//        result /= gt(k);
//        return (int)result;
//        int[] dd = new int[n+1];
//        for(int i=1;i<=n;i++) dd[i]=i;
//        for(int i= n-k+1;i<=n;i++){
//            for(int j=k;j>=2;j--){
//                if(dd[i] <j) break;
//                if(dd[j] !=1 && dd[i]%dd[j] != 0) {
//                    dd[i] /=dd[j];
//                    dd[j]=1;
//                }
//            }
//        }
        double result2=1;
        for(int i=1;i<=k;i++){
            result2 *=n-k+i;
            result2 /=i;
        }
        return (long) result2;
    }

    public long gt(int x){
        long result =1;
        for(int i=2;i<=x;i++){
            result *=i;
        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(new l70().climbStairs(44));
        //new BigInteger("1").
        //System.out.println(new l70().tohop(15,30));
        for(int i=1;i<=45;i++){
            System.out.println(i+" "+(45-i)+" : "+new l70().tohop(i,45-i));
        }
    }
}
