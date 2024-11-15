package com.teachmeskills.lesson_12.task_7.fabric;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Word {

    public static int ladderLength(String beginWord, String endWord, Set<String> wordDict) {

        if (!wordDict.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int steps = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String word = queue.poll();

                for (int j = 0; j < word.length(); j++) {
                    char[] wordArray = word.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        wordArray[j] = c;
                        String newWord = new String(wordArray);

                        if (newWord.equals(endWord)) {
                            return steps + 1;
                        }

                        if (wordDict.contains(newWord)) {
                            queue.add(newWord);
                            wordDict.remove(newWord);
                        }
                    }
                }
            }
            steps++;
        }
        return 0 ;
    }
}
