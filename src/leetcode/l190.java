package leetcode;

public class l190 {
    public int reverseBits(int n) {
        String bitx = Long.toBinaryString(n);
        while(bitx.length() <32){
            bitx = "0"+bitx;
        }
        System.out.println(bitx);
        String reverBit = new StringBuilder(bitx).reverse().toString();
        //return Integer.parseInt(reverBit,2);
        return convert2int(reverBit);
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
