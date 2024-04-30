package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l78 {
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        List<List<Integer>> listRes = new ArrayList<>();
        String nBin = new String(new char[n]).replace('\0', '1');
        int maxNum = Integer.parseInt(nBin, 2);
        for(int i=0;i<=maxNum;i++) {
            listRes.add(getArr(i));
        }
        return listRes;
    }

    List<Integer> getArr(Integer x) {
        String xBin = new StringBuilder(Integer.toBinaryString(x)).reverse().toString();
        List<Integer> arr = new ArrayList<>(11);
        for(int i=0;i<xBin.length();i++) {
            if(xBin.charAt(i) == '1') {
                arr.add(nums[i]);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        l78 ins = new l78();
        System.out.println(ins.subsets(nums));
    }
}
