## Leetcode 167

### 题目描述

给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。


### 解题思路
创建两个游标指向数组的头和尾，因为是顺序排列，所以如果目标值小于首尾之和只能尾游标向前移动一位，
如果目标值大于首尾之和只能头游标向后移动一位，否则就是等于目标值然后返回从1开始的下标值


```java
public class Solution {
    // Time: O(n), Space: O(1)
    public int[] getTwoSumToGivenValue(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] > target) j--;
            else if (numbers[i] + numbers[j] < target) i++;
            else return new int[]{i + 1, j + 1};
        }
        return new int[]{-1, -1};
    }
}
```