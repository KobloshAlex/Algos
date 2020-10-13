package leetcode.strings;

import java.util.Arrays;

public class StringPermutation {

    // Check Permutation: Given two strings, write a method to decide if one is a permutation of the
    // other.
    public static boolean check1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        final char[] charsS = s.toLowerCase().toCharArray();
        final char[] charsT = t.toLowerCase().toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);

        return Arrays.toString(charsS).equals(Arrays.toString(charsT));
    }
}
