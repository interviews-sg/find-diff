package com.socgen.marvel.interviews.stringdiff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void findDiff_simple() {
        assertEquals("cd", StringUtils.findDiff("abc", "abd"));
    }

    @Test
    void findDiff_noDiff() {
        assertEquals("", StringUtils.findDiff("abc", "abc"));
    }

    @Test
    void findDiff_longerFirst() {
        assertEquals("d", StringUtils.findDiff("abcd", "abc"));
    }

    @Test
    void findDiff_longerSecond() {
        assertEquals("d", StringUtils.findDiff("abc", "abcd"));
    }

    @Test
    void findDiff_middle() {
        assertEquals("xy", StringUtils.findDiff("abxcd", "abycd"));
    }

    @Test
    void findDiff_duplicateLetters() {
        assertEquals("dd", StringUtils.findDiff("abccc", "abcdaaa"));
    }

    @Test
    void findDiff_numbersAndSymbols() {
        assertEquals("123#@$", StringUtils.findDiff("abc123", "abc#@$"));
    }
}