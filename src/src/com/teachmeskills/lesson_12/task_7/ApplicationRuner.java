package com.teachmeskills.lesson_12.task_7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.teachmeskills.lesson_12.task_7.fabric.Word.ladderLength;

/*Имея два слова (начало и конец) и словарь, найдите длину кратчайшей
     последовательности преобразований от начала до конца, при которой за один раз
     можно изменить только одну букву.
     И каждое промежуточное слово должно существовать в словаре.
     Например, учитывая:
     старт = "hit"
     конец = "cog"
     dict = ["hot", "dot", "dog", "lot", "log"]
     Одно кратчайшее преобразование — это «hit» -> «hot» -> «dot» -> «dog» -> «cog»,
     программа должна вернуть длину 5.*/

public class ApplicationRuner {
    public static void main(String[] args) {

        String start = "hit";
        String end = "cog";
        Set<String> dict = new HashSet<>(Arrays.asList("hot", "dot", "dog", "lot", "log"));

        int result = ladderLength(start, end, dict);
        System.out.println("Length of shortest transformation sequence: " + result);

    }
}
