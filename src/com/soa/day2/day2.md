## Leetcode 1

### 题目描述

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

### 解题思路
方法一是使用暴力破解，双层遍历

方法二是将数组的值当作HashMap的键，数组的序号当作HashMap的值存储起来，
遍历时计算出需要的HashMap的键，如果在HashMap中查找到，则返回对应的键所对应的值，
没找到将该键值添加到HashMap中


```java
public class Solution {
    // Time: O(n^2), Space: O(1)
    public int[] getTwoSumToBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // Time: O(n), Space: O(n)
    public int[] getTwoSumToHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int numNeeded = target - nums[i];
            if (map.containsKey(numNeeded)) {
                return new int[]{map.get(numNeeded), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
```