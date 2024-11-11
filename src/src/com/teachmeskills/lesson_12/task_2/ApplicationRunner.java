package com.teachmeskills.lesson_12.task_2;

import java.util.Scanner;

import static com.teachmeskills.lesson_12.task_2.fabric.ValidURL.Valid;

/*Задача 2
        Написать программу, которая будет проверять, что введенная ссылка валидная.
        Например, при анализе вот такой ссылки https://teachmeskills.by/kursy/programmirovaniya-online -
       // программа должна вернуть, что ссылка валидна.
        а при вводе tcp://teachmeskills.by/kursy/programmirovaniya-online - программа должна вернуть, что ссылка не валидна
       // (ссылка начинается ни с http, ни с https)*/

public class ApplicationRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter URL to check:");
        String input = scanner.nextLine();

        if (Valid(input)) {
            System.out.println("The link is valid.");
        } else {
            System.out.println("The link is not valid.");
        }
    }
}
