package may.week3.sameTree;

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return validateSameTree(p, q);
    }

    private static void validateSameTree_FAILVERSION(TreeNode p, TreeNode q, boolean result) {
        if (p.val != q.val) {
            result = false;
        }
        if (p.left != null) {
            if (q.left == null) {
                result = false;
            }else{
                validateSameTree_FAILVERSION(p.left, q.left, result);
            }
        }
        if (p.right != null) {
            if (q.right == null) {
                result = false;
            }else{
                validateSameTree_FAILVERSION(p.right, q.right, result);
            }
        }
    }
    private static boolean validateSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean leftSame = validateSameTree(p.left, q.left);
        boolean rightSame = validateSameTree(p.right, q.right);
        return leftSame && rightSame;
    }
}
