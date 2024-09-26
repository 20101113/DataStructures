package com.cache.booksystem.datastructres.array;

public class SingleLoopSecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7};  // Example array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        // Single loop to find both largest and second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE)
        System.out.println("The second largest element is: " + -1);
        else
        System.out.println("The second largest element is: " + secondLargest);
    }

   
}