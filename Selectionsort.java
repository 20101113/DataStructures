package com.cache.booksystem.datastructres.array;

public class Selectionsort {
    
   
        public static void main(String[] args) {
            int[] arr = {29, 10, 14, 37, 13}; // Example array
            selectionSort(arr); // Sorting the array
            System.out.println("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    
        public static void selectionSort(int[] arr) {
            int n = arr.length;
            // Loop through the array
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i; // Assume the current element is the minimum
                // Find the actual minimum element in the rest of the array
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j; // Update the minimum index
                    }
                }
                // Swap the found minimum element with the current element
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    
