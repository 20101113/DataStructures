package com.cache.booksystem.datastructres.array;

import java.util.Arrays;

public class PairWithSum {
    public static boolean hasPairWithSum(int[] arr, int sum) {
        // Sort the array
        Arrays.sort(arr);

        // Use two pointers
        int left = 0;
        int right = arr.length - 1;

        // Move the two pointers until they meet
        while (left < right) {
            int currentSum = arr[left] + arr[right];

            // Check if the sum is equal to the target sum
            if (currentSum == sum) {
                return true;
            } else if (currentSum < sum) {
                left++; // Increase the left pointer if sum is smaller
            } else {
                right--; // Decrease the right pointer if sum is larger
            }
        }

        // If no pair is found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 8, 5, 7};
        int sum = 9;
        
        if (hasPairWithSum(arr, sum)) {
            System.out.println("Pair with given sum exists.");
        } else {
            System.out.println("Pair with given sum does not exist.");
        }
    }
}
