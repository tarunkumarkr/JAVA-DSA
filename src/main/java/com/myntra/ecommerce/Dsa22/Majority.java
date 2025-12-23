package com.myntra.ecommerce.Dsa22;

import java.util.HashMap;
import java.util.Map;

public class Majority {

    public static int maj(int[] inp){

        for (int i = 0; i < inp.length-1; i++) {
            int count=1;
            if (inp[i]==0)
                continue;
            for (int j = i+1; j < inp.length ; j++) {
                if(inp[i]==inp[j]){
                    count++;
                    inp[j]=0;
                }
            }
            if(count> inp.length/2)
                return inp[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,3,3,4,3,4,4,4,4,4,4,4,4,4,4,4};

        System.out.println(maj(a));

    }
}
