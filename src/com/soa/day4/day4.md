## Leetcode 101

### 题目描述

给定一个二叉树，检查它是否是镜像对称的。


### 解题思路
法一：使用递归对每一个节点都进行一次遍历，递归的终止条件是左右节点都为空返回true，
一个为空，一个不为空返回false，用表达式 s == null && t == null 就可以满足终止条件

法二：使用迭代建立一个堆，按照左节点的左子节点、右节点的右子节点、左节点的右子节点、右节点的左子节点顺序
push到堆中，每次弹出两个节点进行比较


```java
public class Solution {
    boolean isSymmetric(TreeNode s, TreeNode t) {
        if (s != null && t != null) {
            return s.val == t.val && isSymmetric(s.right, t.left)
                    && isSymmetric(s.left, t.right);
        } else return s == null && t == null;
    }

    // 法一，Time: O(n), Space: O(n)
    public boolean isSymmetricTreeRecursive(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }
}
```

```java
public class Solution {
    // 法二，Time: O(n), Space: O(n)
    public boolean isSymmetricTreeIterative(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.empty()) {
            TreeNode s = stack.pop(), t = stack.pop();
            if (s == null && t == null) continue;
            if (s == null || t == null) return false;
            if (s.val != t.val) return false;

            stack.push(s.left);
            stack.push(t.right);
            stack.push(s.right);
            stack.push(t.left);
        }
        return true;
    }
}
```