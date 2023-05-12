package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l144 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        addVal(root);
        return result;
    }

    void addVal(TreeNode node){
        if(node==null) return;
        result.add(node.val);
        addVal(node.left);
        addVal(node.right);
    }
}
