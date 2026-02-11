package com.myntra.ecommerce.Jan27;

public class ContainingParanthesis {

    public static boolean isBalanced(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }

            if (count < 0) return false;
        }
        return count == 0;
    }

    public static void main(String[] args) {

        String s="(()()";
        System.out.println(isBalanced(s));
    }
}
