package com.teachmeskills.lesson_12.task_6.validator;

public class RotateArray {

    public static void rotate(int[] array, int k) {
        int n = array.length;
        k = k % n;

        reverse(array, 0, n - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
