package problems;

import java.util.ArrayList;
import java.util.List;

public class Q102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        recurse(lists, root, 0);
        return lists;
    }

    public void recurse(List<List<Integer>> lists, TreeNode node, int level) {
        if (node == null) {
            return;
        }

        List<Integer> levelList;
        if (lists.size() <= level) {
            levelList = new ArrayList<>();
            lists.add(levelList);
        } else {
            levelList = lists.get(level);
        }
        levelList.add(node.val);
        recurse(lists, node.left, level + 1);
        recurse(lists, node.right, level + 1);
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
