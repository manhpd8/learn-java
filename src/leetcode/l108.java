package leetcode;

public class l108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode rootNode = sortedArrayToAVL(nums, 0, nums.length - 1);
        return rootNode;
    }

    TreeNode sortedArrayToAVL(int[] nums, int start, int end) {
        if(start > end) return null;
        int midIndex = (start + end)/2;
        TreeNode rootNode = new TreeNode(nums[midIndex]);
        TreeNode leftNode = null;
        TreeNode rightNode = null;
        if(start != end) {
            leftNode = sortedArrayToAVL(nums, start, midIndex-1);
            rightNode = sortedArrayToAVL(nums, midIndex + 1, end);
        }
        rootNode.left = leftNode;
        rootNode.right = rightNode;
        return rootNode;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        l108 ins = new l108();
        System.out.println(ins.sortedArrayToBST(nums));
        System.out.println();
    }
}
