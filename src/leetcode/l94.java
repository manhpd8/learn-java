package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l94 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        dq(root);
        return result;
    }

    public void dq(TreeNode root){
        if(root == null) return;
        if(root.left != null) inorderTraversal(root.left);
        result.add(root.val);
        if(root.right!= null) inorderTraversal(root.right);
    }
}
