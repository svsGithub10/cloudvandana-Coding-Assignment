/*

Problem Statement:

2. String Manipulation - Anagram Check Write a Java program that takes two strings as input and checks if they are anagrams
(containing the same characters in a different order).

Example:\

Input: "listen", "silent"
Output: true
Input: "hello", "world"
Output: false

 */

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
    }
}
