package leetcode;

public class l110 {
    public boolean isBalanced(TreeNode root) {
        if(root ==null) return true;
        int lh = getH(root.left);
        int rh = getH(root.right);
        if(Math.abs(lh-rh)>1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
    int getH(TreeNode node){
        if(node ==null) return 0;

        int lh=getH(node.left);
        int rh=getH(node.right);

        return Math.max(lh,rh)+1;
    }
}
