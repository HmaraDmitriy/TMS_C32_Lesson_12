package com.teachmeskills.lesson_12.task_3;

import java.util.Scanner;

/*Пользователь вводит трехзначное число.
        Программа должна сложить цифры, из которых состоит это число.
        Например, если было введено 349, программа должна вывести на экран число 16, так
        как 3 + 4 + 9 = 16.*/

/*Усложнение задачи 3.
        Вводится число любой длины (от нуля и до бесконечности). Надо найти сумму его
        чисел.*/


public class ApplicationRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a three digit number: ");
        int x = scanner.nextInt();

        if (x >= 100 && x <= 999) {
            int hundreds = x / 100;
            int tens = (x / 10) % 10;
            int units = x % 10;
            int sum = hundreds + tens + units;

            System.out.println("Sum of the digits of a number: " + sum);
        } else {
            System.out.println("The number is not three-digit.");
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter any number: ");
        String y = scanner2.nextLine();

        if (y.matches ("\\d+")) {
            int sum = 0;

            for (char number : y.toCharArray()) {
                int digit = Character.getNumericValue(number);
                sum += digit;
            }

            System.out.println("Sum of the digits of a number: " + sum);
        } else {
            System.out.println("Error");
        }

    }
}
