package leetcode;

public class l190 {
    public int reverseBits(int n) {
        int result=0;
        for(int i=1;i<=32;i++){
            result <<=1;//dich trai 1 bit
            result |= n&1;
            n>>=1;
        }
        return result;
    }

    public static void main(String[] args) {
        int x=2147483647;
        //System.out.println(new l190().convert2int("11111111111111111111111111111101"));
        //System.out.println(Integer.parseInt("11111111111111111111111111111101",2));
        System.out.println(new l190().reverseBits(x));
    }
    int convert2int(String str){
        int x=0;
        for(int i=31;i>=0;i--){
            if(str.charAt(i) == '1'){
                x+= Math.pow(2,31-i);
            }
        }
        return x;
    }
    String convert2Str(int x){
        String str="";
        while (x>0){
            str = x%2 + str;
            x /=2;
        }
        return str;
    }
}
