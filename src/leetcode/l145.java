package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l145 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        addNode(root);
        return result;
    }
    void addNode(TreeNode root){
        if(root==null) return;
        addNode(root.left);
        addNode(root.right);
        result.add(root.val);
    }
}
