package com.myntra.ecommerce;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int []a={2,0,4,0,8,0,0,0,7};

        int r=a.length;

                int j = 0;

        for (int i = 0; i < r; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                j++;
            }
        }

        System.out.println(Arrays.toString(a));
            }
        }



