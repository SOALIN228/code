package com.soa;

import com.soa.day2.Solution;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.getTwoSumToHashMap(new int[]{1, 2, 8, 9, 2, 3}, 10);
        System.out.println(Arrays.toString(result));
    }
}
