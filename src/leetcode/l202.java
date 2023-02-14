package leetcode;

public class l202 {
    boolean[] markValue = new boolean[811];

    public boolean isHappy(int n) {
        do {
            n = sumOfSquare(n);
            if (markValue[n]) return false;
            if (n == 1) return true;
            markValue[n] = true;
        } while (true);
    }

    int sumOfSquare(int n) {
        int sumOfSquare = 0;
        while (n > 0) {
            sumOfSquare += (n % 10) * (n % 10);
            n /= 10;
        }
        return sumOfSquare;
    }

    //    2 4 16  37 58
    public static void main(String[] args) {
        l202 ins = new l202();
        System.out.println(ins.isHappy(19));
    }
}
