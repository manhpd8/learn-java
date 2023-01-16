package leetcode;
public class main {
    public static void main(String[] args) {
        int[] ar = new int[]{4,1,-1,2,-1,2,3};
        int[][] ar2 = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        new l347().topKFrequent(ar,2);
        //new l238().productExceptSelf(ar);
        //new l49().groupAnagrams(strs);
        //new l289().gameOfLife(ar2);
    }
public static void tests(int[] ar){
        ar[0]=2;
}

}
