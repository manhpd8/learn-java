package leetcode;

import java.util.Arrays;

public class l66 {
        public int[] plusOne(int[] digits) {
            int no=1;
            for(int i=digits.length-1;i>=0;i--){
                int tong = digits[i]+no;
                digits[i] = tong%10;
                no=tong/10;
            }
            if(no==0) return digits;
            int[] result = Arrays.copyOf(digits, digits.length+1);
            result[0]=no;
            return result;

        }
}
