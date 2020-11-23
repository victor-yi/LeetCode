package problems;

import java.util.ArrayList;
import java.util.List;

public class Q94_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        inorderTraversal(root, output);
        return output;
    }

    public void inorderTraversal(TreeNode root, List<Integer> output) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorderTraversal(root.left, output);
        }
        output.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right, output);
        }
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
