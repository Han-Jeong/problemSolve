package april.week4.maximumDepthOfBinaryTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void addNode(int val) {
        TreeNode treeNode = new TreeNode(val);
        if (this.val > val) {
            this.left = treeNode;
        } else if (this.val < val) {
            this.right = treeNode;
        }
    }
}
