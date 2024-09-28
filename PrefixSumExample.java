package com.cache.booksystem.datastructres.array;

import java.util.Arrays;

public class PrefixSumExample {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9}; // Original array
        int targetSum = 6; // Example target sum
        int[] prefixSum = new int[arr.length];

        // Building the prefix sum array
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Example: Find subarrays with sum equal to targetSum
        findSubarraysWithTargetSum(arr, prefixSum, targetSum);
    }

    public static void findSubarraysWithTargetSum(int[] arr, int[] prefixSum, int targetSum) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i <= j; i++) {
                int sum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
                if (sum == targetSum) {
                    System.out.println("Subarray with sum " + targetSum + ": " + Arrays.toString(getSubarray(arr, i, j)));
                }
            }
        }
    }

    private static int[] getSubarray(int[] arr, int start, int end) {
        int[] subarray = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            subarray[i - start] = arr[i];
        }
        return subarray;
    }
}
