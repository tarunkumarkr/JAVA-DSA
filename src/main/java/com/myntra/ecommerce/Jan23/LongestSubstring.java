package com.myntra.ecommerce.Jan23;

public class LongestSubstring {

    public static int longestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = "";

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if (temp.indexOf(c) != -1) {
                    break;
                }

                temp = temp + c;
                maxLength = Math.max(maxLength, temp.length());
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
}}

