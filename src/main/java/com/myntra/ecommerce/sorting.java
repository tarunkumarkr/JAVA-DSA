package com.myntra.ecommerce;

import java.util.Arrays;

public class sorting {

    public static void main(String[] args) {

        int []a={2,0,4,0,8,0,0,0,7};
        int k =0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]!=0)
            {
                int tmp=a[i];
                a[i]=a[k];
                a[k]=tmp;

                k++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
