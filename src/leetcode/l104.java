package leetcode;

public class l104 {
    int mmax=0;
    public int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        getMaxDept(root,1);
        return mmax;
    }
    public void getMaxDept(TreeNode root, int dept){
        if(dept > mmax) mmax =dept;
        if(root.left != null){
            getMaxDept(root.left, dept+1);
        }
        if(root.right != null){
            getMaxDept(root.right, dept+1);
        }
    }
}
