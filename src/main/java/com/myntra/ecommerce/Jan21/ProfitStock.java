package com.myntra.ecommerce.Jan21;

public class ProfitStock {


    public static int profit(int []a){

        int max=0;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j <a.length ; j++) {

                int profit=a[j]-a[i];
                max=Math.max(max,profit);
            }
        }

        if (max>0)
            return max;


        return 0;
    }

    public static void main(String[] args) {
        int []inp ={7, 1, 5, 3, 6, 4};

        System.out.println( profit(inp));
    }
}
