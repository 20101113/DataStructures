package com.cache.booksystem.datastructres.array;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3}; // Example array
        insertionSort(arr); // Sorting the array
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Insert the key at its correct position
        }
    }
}
