package com.teachmeskills.lesson_12.task_2.fabric;

public class ValidURL {
    public static boolean Valid (String url) {
        return url.startsWith("http://") || url.startsWith("https://");
    }
}
