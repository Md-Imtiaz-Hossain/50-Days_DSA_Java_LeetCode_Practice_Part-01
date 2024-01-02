package com.iimtiaz.day_00;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {
    @Test
    public void testAnagrams() {
        Solution_1 solution = new Solution_1();
        assertTrue(solution.isAnagram("anagram", "nagaram"));
        assertTrue(solution.isAnagram("listen", "silent"));
        assertTrue(solution.isAnagram("race", "care"));
        assertTrue(solution.isAnagram("a", "a"));
    }

    @Test
    public void testNotAnagrams() {
        Solution_1 solution = new Solution_1();
        assertFalse(solution.isAnagram("rat", "car"));
        assertFalse(solution.isAnagram("hello", "world"));
        assertFalse(solution.isAnagram("abc", "def"));
        assertFalse(solution.isAnagram("", "a"));
        assertFalse(solution.isAnagram("a", ""));
    }

}