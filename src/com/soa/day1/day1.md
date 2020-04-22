## Leetcode 125

### 题目描述

给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

### 解题思路
在字符串首位分别设置两个游标，判断游标字符是否满足字母或数字的条件，
不满足直接向前或向后移动游标，两个游标都满足时进行字符比较，
字符相等游标向前或向后移动一位，不等直接返回false


```java
public class Solution {
    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private boolean isEqualIgnoreCase(char a, char b) {
        if (a >= 'A' && a <= 'Z') a += 32;
        if (b >= 'A' && b <= 'Z') b += 32;
        return a == b;
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        int i = 0, j = s.length() - 1;
        for (; i < j; i++, j--) {
            while (i < j && !isAlphanumeric(s.charAt(i))) i++;
            while (i < j && !isAlphanumeric(s.charAt(j))) j--;
            if (i < j && !isEqualIgnoreCase(s.charAt(i), s.charAt(j))) return false;
        }
        return true;
    }
}
```