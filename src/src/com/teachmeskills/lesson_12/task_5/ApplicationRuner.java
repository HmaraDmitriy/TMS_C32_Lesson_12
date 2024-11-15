package com.teachmeskills.lesson_12.task_5;

/*
Банковский вклад.
        Пользователь делает вклад в размере a рублей сроком на years лет под 10% годовых
        (каждый год размер его вклада увеличивается на 10%.Эти деньги прибавляются к
        сумме вклада, и на них в следующем году тоже будут проценты).
        Написать программу bank, принимающая аргументы a и years, и возвращающую
        сумму, которая будет на счету пользователя.*/


public class ApplicationRuner {
    public static double calculate(double amount, int years) {
        double interestRate = 0.10;
        double finalAmount = amount * Math.pow(1 + interestRate, years);
        return finalAmount;
    }

    public static void main(String[] args) {
        double initialAmount = 84238;
        int years = 3;
        System.out.println("Amount on the account after " + years + " years: " + calculate(initialAmount, years));
    }
}
