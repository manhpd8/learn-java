package leetcode;

public class l29 {
    public int divide(int dividend, int divisor) {
        boolean cungdau = (dividend < 0 == divisor < 0);

        long dividendL = dividend;
        dividendL = Math.abs(dividendL);
        long divisorL = divisor;
        divisorL = Math.abs(divisorL);
        if (divisorL > dividendL) return 0;
        if (dividendL == divisorL) {
            if (cungdau) return 1;
            return -1;
        }
        long result = 0;
        while (dividendL >= divisorL) {
            int soBitDich = dichbit(dividendL, divisorL);
            result += Math.pow(2, soBitDich);
            dividendL -= divisorL << soBitDich;
        }

        if (cungdau) {
            if (result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return (int) result;
        } else {
            if (result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return (int) (0 - result);
        }

    }

    int dichbit(long dividend, long divisor) {
        for (int i = 1; i < 34; i++) {
            if (divisor << i > dividend) return i - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        l29 ins = new l29();
        System.out.println(ins.divide(-1010369383, -2147483648));
    }
}
