package leetcode;

public class l6309 {
    public int findValidSplit(int[] nums) {
        int n = nums.length;
        System.out.println(n);
        long tongtich=1;
        for(int i=0;i<n;i++){
            tongtich*=nums[i];
        }
        long tich=1;
        for(int i=0;i<=n-2;i++){
            tich *=nums[i];
            if(gcd(tich, tongtich/tich) == 1){
                return i;
            }
        }
        return -1;
    }
    long gcd(long a, long b)
    {
        long i;
        if (a < b)
            i = a;
        else
            i = b;
        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        l6309 ins = new l6309();
        int[] nums = new int[]{557663,280817,472963,156253,273349,884803,756869,763183,557663,964357,821411,887849,891133,453379,464279,574373,852749,15031,156253,360169,526159,410203,6101,954851,860599,802573,971693,279173,134243,187367,896953,665011,277747,439441,225683,555143,496303,290317,652033,713311,230107,770047,308323,319607,772907,627217,119311,922463,119311,641131,922463,404773,728417,948281,612373,857707,990589,12739,9127,857963,53113,956003,363397,768613,47981,466027,981569,41597,87149,55021,600883,111953,119083,471871,125641,922463,562577,269069,806999,981073,857707,831587,149351,996461,432457,10903,921091,119083,72671,843289,567323,317003,802129,612373};
        System.out.println(ins.findValidSplit(nums));
    }
}
