package leetcode;

public class l112 {
    int targetSum;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        this.targetSum = targetSum;
        if(targetSum < root.val) return false;
        if(targetSum == root.val && root.right==null && root.left==null) return true;
        return equalSum(root,0,0);
    }

    boolean equalSum(TreeNode root, int curSum,int dept){
        if(targetSum==curSum && root ==null && dept>1) return true;
        if(root==null) return false;
        if(curSum+root.val > targetSum) return false;
        return equalSum(root.right, curSum+root.val, dept+1) || equalSum(root.left, curSum+root.val, dept+1);
    }
}
