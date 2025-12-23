package com.myntra.ecommerce.Dsa22;

import java.sql.Array;
import java.util.Arrays;

public class Concat {

    public static void main(String[] args) {

        int[] a={1,2,3};
        int[] b={4,5,6};

        int oLen=a.length+b.length;

        int out[]= new int[oLen];

        int k=0;

        for (int i = 0; i <a.length ; i++) {
            out[k++]=a[i];
        }
        for (int j=0; j<b.length; j++){
            out[k++]=b[j];

        }


        System.out.println(Arrays.toString(out));
    }
}
