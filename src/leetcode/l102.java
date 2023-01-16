package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class l102 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return result;
        result.add(List.of(root.val));
        readNode(root,1);
        result = result.stream().filter(l -> l.size()>0).collect(Collectors.toList());
        return result;
    }
    private void readNode(TreeNode root,int level){
        if(root == null) return;
        List<Integer> subList;
        if(result.size() <= level) {
            subList = new ArrayList<>();
            result.add(subList);
        } else {
            subList = result.get(level);
        }

        if(root.left!=null){
            subList.add(root.left.val);
        }
        if(root.right != null){
            subList.add(root.right.val);
        }

        if(root.left!=null){
            readNode(root.left, level+1);
        }
        if(root.right != null){
            readNode(root.right, level+1);
        }
    }
}
