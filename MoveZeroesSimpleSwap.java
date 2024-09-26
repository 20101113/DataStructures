package com.cache.booksystem.datastructres.array;

public class MoveZeroesSimpleSwap {
    public static void moveZeroesToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 0, 0, 5, 0, 6, 7};
        moveZeroesToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
