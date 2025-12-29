package com.myntra.ecommerce.Dsa29;

public class Repeating {


    public static int find(String s) {
        char[] ss = s.toCharArray();

        for (int i = 0; i < ss.length - 1; i++) {
            int count = 1;
            if(ss[i]==0)
                continue;
            for (int j = i + 1; j < ss.length; j++) {
                if (ss[i] == ss[j]) {
                    count++;
                    ss[j]=0;
                }
            }
            if(count==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        String s="aabb";
        System.out.println(find(s));
    }
}
