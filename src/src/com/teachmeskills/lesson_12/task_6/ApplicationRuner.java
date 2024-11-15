package com.teachmeskills.lesson_12.task_6;

import com.teachmeskills.lesson_12.task_6.validator.RotateArray;
import java.util.Arrays;

/*Повернуть массив из n элементов вправо на k шагов.
        Например, с n = 7 и k = 3 массив [1,2,3,4,5,6,7] вращается до [5,6,7,1,2,3,4].*/


public class ApplicationRuner extends RotateArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(array, k);
        System.out.println("Rotated array: " + Arrays.toString(array));

    }
}
