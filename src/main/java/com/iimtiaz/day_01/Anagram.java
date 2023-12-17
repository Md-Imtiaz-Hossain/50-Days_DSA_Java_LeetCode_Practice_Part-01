package com.iimtiaz.day_01;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("pabcer", "abc"));
        System.out.println(solution.isAnagram("rat", "car"));
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }


// =======================================
//            Sure, I'd be happy to explain the code. This Java program checks if two strings are anagrams of each
//            other without using library functions. Here's a breakdown of how it works:
//
//            1. `if (s.length() != t.length()) { return false; }`: This line checks if the lengths of the two strings
//            are equal. If they're not, it immediately returns `false` because two strings can't be anagrams if they
//            have different lengths.
//
//            2. `int[] charCounts = new int[26];`: This line creates an array of 26 integers to count the occurrences
//            of each lowercase English letter in the strings. Each index in the array corresponds to a letter ('a' is
//            at index 0, 'b' is at index 1, and so on).
//
//            3. The `for` loop `for (int i = 0; i < s.length(); i++) { ... }` iterates over the characters in the
//            strings. For each character, it increments the count for that character in `s` and decrements the count
//            for that character in `t`. This is done with the lines `charCounts[s.charAt(i) - 'a']++;` and
//            `charCounts[t.charAt(i) - 'a']--;`.
//
//            4. The `for` loop `for (int count : charCounts) { ... }` then iterates over the counts in the `charCounts`
//            array. If it finds a count that is not zero, it returns `false`. This is because if the strings are
//            anagrams, all counts should be zero at the end.
//
//            5. If the program hasn't returned `false` by this point, it returns `true`, indicating that the strings
//            are anagrams.
//
//            This method is efficient and works well for strings that only contain lowercase English letters. If the
//            strings can contain other characters, you would need to adjust the size of the `charCounts` array and the
//            calculations accordingly.
//
//            I hope this helps! Let me know if you have any other questions. 😊

    public boolean areAnagrams(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

// Topic:
// Why it is bad to find every combination and match
// Why substring did not work
// char[] vs String[] vs String, int[]
// https://leetcode.com/problems/valid-anagram/







