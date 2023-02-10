package leetcode;

public class l101 {
    public boolean isSymmetric(TreeNode root) {
        return compareNode(root.left, root.right);
    }

    boolean compareNode(TreeNode lNode, TreeNode rNode){
        if(lNode == null && rNode == null) return true;
        if(lNode == null || rNode == null) return false;
        // 2 node khac null
        if(lNode.val != rNode.val) return false;
        // ben trai
        return compareNode(lNode.left, rNode.right) && compareNode(lNode.right, rNode.left);
    }
}
