package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class l203 {
    int k,dem=0;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        return getKMsmall(root);
    }

    int getKMsmall(TreeNode root){
        if(root == null) return -1;
        if(k==0) return root.val;
        k--;
        int leftV = getKMsmall(root.left);
        if(leftV > -1) return leftV;
        int rightV = getKMsmall(root.right);
        if(rightV > -1) return rightV;
        return -1;
    }






    List<Integer> lst = new ArrayList<>();
    public int kthSmallest2(TreeNode root, int k) {
        getVal(root);
        Collections.sort(lst);
        return lst.get(k-1);
    }
    public void getVal(TreeNode t){
        if(t!=null){
            lst.add(t.val);
            getVal(t.left);
            getVal(t.right);
        }
    }
}
