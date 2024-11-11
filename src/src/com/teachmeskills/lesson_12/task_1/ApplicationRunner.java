package com.teachmeskills.lesson_12.task_1;
import com.teachmeskills.lesson_12.task_1.fabric.Verification;

/*Задача 1
        Написать программу, что переданная строка это hex code для описания цвета.
        Например, при вводе в программу значения #8b2323, программа должна вернуть - Yes.*/

public class ApplicationRunner {
    public static void main(String[] args) {

         String hexCode = "#8b2323";
         System.out.println(Verification.HecCodVerification(hexCode));
    }
}