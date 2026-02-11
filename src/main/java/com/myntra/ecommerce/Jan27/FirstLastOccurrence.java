package com.myntra.ecommerce.Jan27;


public class FirstLastOccurrence {

    public static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                last = i;
                break;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8,5,7,2,0, 8, 10};
        int target = 8;

        int[] res = searchRange(nums, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}

