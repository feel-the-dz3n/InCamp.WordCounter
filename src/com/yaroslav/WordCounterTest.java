package com.yaroslav;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @org.junit.jupiter.api.Test
    void countWords_Test1() {
        // InterLink, inCamp, internship are repeated twice here:
        String text = "I like InterLink inCamp internship. InterLink inCamp is the best internship ever.";

        // Counting words
        var wordsMap = WordCounter.countWords(text, false);

        // Should be 9 without repeating words
        assertEquals(9, wordsMap.size());

        // Should be 2 for repeating words
        assertEquals(2, wordsMap.get("InterLink"));
        assertEquals(2, wordsMap.get("inCamp"));
        assertEquals(2, wordsMap.get("internship"));
    }

    @org.junit.jupiter.api.Test
    void countWords_Test2__IgnoreCase() {
        String text = "My name is Yaroslav. I like pizza. And I like programming. This is my purpose: to eat and to code.";

        // Counting words
        var wordsMap = WordCounter.countWords(text, true);

        assertEquals(14, wordsMap.size());

        assertEquals(2, wordsMap.get("i"));
        assertEquals(2, wordsMap.get("my"));
        assertEquals(2, wordsMap.get("is"));
        assertEquals(2, wordsMap.get("to"));
        assertEquals(2, wordsMap.get("like"));
    }

    @org.junit.jupiter.api.Test
    void countWords_Test2__UseCase() {
        String text = "My name is Yaroslav. I like pizza. And I like programming. This is my purpose: to eat and to code.";

        // Counting words
        var wordsMap = WordCounter.countWords(text, false);

        assertEquals(16, wordsMap.size());

        assertEquals(2, wordsMap.get("I"));
        assertEquals(2, wordsMap.get("my"));
        assertEquals(2, wordsMap.get("is"));
        assertEquals(2, wordsMap.get("to"));
        assertEquals(2, wordsMap.get("like"));
        assertEquals(1, wordsMap.get("and"));
        assertEquals(1, wordsMap.get("And"));
    }
}