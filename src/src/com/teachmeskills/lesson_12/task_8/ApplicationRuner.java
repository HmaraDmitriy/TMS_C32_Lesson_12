package com.teachmeskills.lesson_12.task_8;

import static com.teachmeskills.lesson_12.task_8.fabric.TwoSum.twoSum;

/*Дан массив целых чисел, найдите два числа, которые в сумме дают заданное число.
      Функция twoSum должна возвращать индексы двух чисел так, чтобы они складывались
      в целевое число.
      Например:
      Ввод: числа={2, 7, 11, 15}, цель=9.
      Выход: индекс1=0, индекс2=1.*/

public class ApplicationRuner {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);
        if (result.length == 2) {
            System.out.println("index1=" + result[0] + ", index2=" + result[1]);
        } else {
            System.out.println("No pair of numbers that add up to the target value was found..");
        }
    }
}
