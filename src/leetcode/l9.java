package leetcode;

public class l9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String strB = new StringBuilder().append(x).reverse().toString();
        return strB.equals(""+x);
    }

    public static void main(String[] args) {
        l9 l9 = new l9();
        System.out.println(l9.isPalindrome(121));
    }
}
