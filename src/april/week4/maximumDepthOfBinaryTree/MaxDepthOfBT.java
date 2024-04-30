package april.week4.maximumDepthOfBinaryTree;


public class MaxDepthOfBT {
    public static int maxDepth(TreeNode root) {
        int depth = 1;
        int max = depth;
        return root != null ? traversal(depth, max, root):0;
    }

    public static int traversal(int curDepth, int max, TreeNode cur) {
        int maximum = Math.max(max, curDepth);
        if (cur.right != null) {
            maximum = Math.max(curDepth, traversal(curDepth+1, maximum, cur.right));
        }
        if (cur.left != null) {
            maximum = Math.max(curDepth, traversal(curDepth+1, maximum, cur.left));
        }
        return maximum;
    }
}
