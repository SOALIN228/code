package com.soa.day3;

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
