package com.myntra.ecommerce.Dsa30;

import java.util.Arrays;

public class ReArrange {

    public static void main(String[] args) {

      int [] i= {1,0,2,2,0,1,1,1,0,2,0,0,0,2,0};

      int l=0,r=i.length-1;

        for (int j = 0; j <i.length ; j++) {
            if(i[j]==2){
                int tmp=i[j];
                i[j]=i[l];
                i[l++]=tmp;
            }
        }

        for (int j = i.length-1; j >=0 ; j--) {
            if(i[j]==1){
                int tmp=i[j];
                i[j]=i[r];
                i[r--]=tmp;
            }
        }

        System.out.println(Arrays.toString(i));

    }
}
