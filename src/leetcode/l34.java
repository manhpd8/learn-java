package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class l34 {

    public int[] searchRange(int[] nums, int target) {
        int l = Arrays.binarySearch(nums, target);
        int r=l;
        int[] result = new int[]{-1,-1};
        if(l==-1) return result;
        while (l-1>=0 && nums[l-1]==target) l--;
        while (r+1<nums.length && nums[r+1]==target) r++;
        result[0]=l;
        result[1]=r;
        return result;
    }
    public int[] searchRange1(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int[] result = new int[2];
        result[0] = list.indexOf(target);
        result[1] = list.lastIndexOf(target);
        return result;
    }

    public static void main(String[] args) {
        l34 ins = new l34();
        System.out.println(ins.searchRange(new int[]{5,7,7,8,8,10},8));
    }
}
