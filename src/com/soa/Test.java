package com.soa;

import com.soa.day3.Solution;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.getTwoSumToGivenValue(new int[]{1, 2, 3, 5, 7}, 10);
        System.out.println(Arrays.toString(result));
    }
}
