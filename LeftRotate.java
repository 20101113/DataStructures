package com.cache.booksystem.datastructres.array;

import java.util.Arrays;

public class LeftRotate {
    public static void leftRotateByOne(int[] arr) {
        int temp = arr[0]; // Store the first element
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; // Shift all elements to the left
        }
        arr[arr.length - 1] = temp; // Move the first element to the end
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateByOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
