package leetcode;

public class main {
    static String s = "a";

    public static void main(String[] args) {
        int[] ar = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[][] ar2 = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        //new l122().maxProfit(ar);
        //new l238().productExceptSelf(ar);
        //new l49().groupAnagrams(strs);
        //new l289().gameOfLife(ar2);
        System.out.println(new l26().removeDuplicates(ar));

    }

    public static void tests(int[] ar) {
        ar[0] = 2;
    }

    static class abc {
        String s = "a";

    }
}
