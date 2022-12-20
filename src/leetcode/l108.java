package leetcode;

public class l108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if(n<=3) return getNodeSpecial(nums);
        if(n==3) return getNodeNormalC4(nums);
        if(n%2==1) return getNodeNormalL(nums);
        else return getNodeNormalC(nums);
    }

    public TreeNode getNodeSpecial(int[] nums){
        // n <=3
        int nMid = nums.length/2;
        TreeNode tRoot = new TreeNode();
        tRoot.val = nums[nMid];
        if(nMid-1>=0){
            TreeNode lNode = new TreeNode();
            lNode.val = nums[nMid-1];
            tRoot.left = lNode;
        }
        if(nMid+1<nums.length){
            TreeNode rNode = new TreeNode();
            rNode.val = nums[nMid+1];
            tRoot.right = rNode;
        }
        return tRoot;
    }

    public TreeNode getNodeNormalC(int[] nums){
        int nMid = nums.length/2;
        TreeNode tRoot = new TreeNode();
        tRoot.val = nums[nMid];
        // xu ly ben trai
        int i=nMid-2;
        TreeNode lNode = new TreeNode();
        lNode.val = nums[i];
        tRoot.left = lNode;

        TreeNode llNode = new TreeNode();
        if(i-1>=0){
            llNode.val = nums[i-1];
            lNode.left = llNode;
        }

        TreeNode lrNode = new TreeNode();
        lrNode.val = nums[i+1];
        lNode.right = lrNode;

        i-=2;
        while (i>=0){
            TreeNode lNode2 = new TreeNode();
            lNode2.val = nums[i];
            llNode.left=lNode2;
            llNode = lNode2;
            i--;
        }

        int j=nMid+1;
        TreeNode rNode = new TreeNode();
        rNode.val=nums[j];
        tRoot.right = rNode;
        j++;
        while (j<nums.length){
            TreeNode rNode2 = new TreeNode();
            rNode2.val = nums[j];
            rNode.right=rNode2;
            rNode=rNode2;
            j++;
        }
        return tRoot;
    }

    public TreeNode getNodeNormalL(int[] nums){
        int nMid = nums.length/2;
        TreeNode tRoot = new TreeNode();
        tRoot.val = nums[nMid];

        int i=nMid-1;
        TreeNode lNode = new TreeNode();
        lNode.val = nums[i];
        tRoot.left = lNode;
        i--;
        while (i>=0){
            TreeNode lNode2 = new TreeNode();
            lNode2.val = nums[i];
            lNode.left=lNode2;
            lNode = lNode2;
            i--;
        }

        int j=nMid+1;
        TreeNode rNode = new TreeNode();
        rNode.val=nums[j];
        tRoot.right = rNode;
        j++;
        while (j<nums.length){
            TreeNode rNode2 = new TreeNode();
            rNode2.val = nums[j];
            rNode.right=rNode2;
            rNode=rNode2;
            j++;
        }
        return tRoot;
    }

    public TreeNode getNodeNormalC4(int[] nums){
        return new TreeNode();
    }
}
