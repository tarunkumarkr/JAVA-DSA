package com.myntra.ecommerce.Dsa30;

import java.util.Arrays;

public class Anagram {

    public static boolean check(String  s1, String s2){

        s1=s1.trim();
        s2=s2.trim();

        char []ss1=s1.toCharArray();
        char []ss2=s2.toCharArray();


        if (ss1.length != ss2.length)
            return false;

        Arrays.sort(ss1);
        Arrays.sort(ss2);
        return Arrays.equals(ss1, ss2);
    }
    public static void main(String[] args) {

         String s1 = "icemann";
         String s2 = "cinemas";

        System.out.println(check(s1,s2));

    }
}
