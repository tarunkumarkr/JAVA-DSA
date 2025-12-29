package com.myntra.ecommerce.Dsa29;

public class maxProfit {
    static int profit(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int profit = a[j] - a[i];
                max = Math.max(max, profit);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println(profit(a));

    }
}

