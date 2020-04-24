package com.soa.day4;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.TreeNode treeNode = solution.new TreeNode(1);
        treeNode.left = solution.new TreeNode(2);
        treeNode.right = solution.new TreeNode(2);
        boolean result = solution.isSymmetricTreeRecursive(treeNode);
        System.out.println(result);
    }
}
