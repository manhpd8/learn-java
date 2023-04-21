package leetcode;

public class l111 {
    int mmin=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        countLengthNode(root,1);
        return mmin;
    }
    void countLengthNode(TreeNode node, int curLength){
        if(node.right==null && node.left==null) {
            if(curLength<mmin) mmin=curLength;
           return;
        }
        curLength++;
        if(node.left != null) countLengthNode(node.left, curLength);
        if(node.right != null) countLengthNode(node.right, curLength);
    }
}
