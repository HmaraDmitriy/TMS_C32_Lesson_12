package com.teachmeskills.lesson_12.task_4;

import java.util.Scanner;

/*Алгоритм Евклида
        Алгоритм Евклида – это алгоритм нахождения наибольшего общего делителя (НОД)
        пары целых чисел.
        Наибольший общий делитель (НОД) – это число, которое делит без остатка два числа
        и делится само без остатка на любой другой делитель данных двух чисел. Проще
        говоря, это самое большое число, на которое можно без остатка разделить два числа,
        для которых ищется НОД.
        Алгоритм нахождения НОД вычитанием:
        1.Из большего числа вычитаем меньшее.
         2.Если получается 0, то значит, что числа равны друг другу и являются НОД
        (следует выйти из цикла).
        3.Если результат вычитания не равен 0, то большее число заменяем на
         результат вычитания.
        4.Переходим к пункту 1.*/

public class ApplicationRunner {
    public static int gcd(int a, int b) {

        while (a != b) {

            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result = gcd(num1, num2);
        System.out.println("GCD for " + num1 + " and " + num2 + " = " + result);
    }
}
