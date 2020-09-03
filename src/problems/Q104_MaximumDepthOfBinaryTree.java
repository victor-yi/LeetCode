package problems;

public class Q104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return hasChildren(root, 0);
    }

    public int hasChildren(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        depth++;
        return Math.max(hasChildren(node.left, depth), hasChildren(node.right, depth));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
