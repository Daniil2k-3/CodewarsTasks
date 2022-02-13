package com.company;

public class IsThereASum {
    public static int[] twoSum(int[] numbers, int target) {
        int [] x = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int firstRes = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (firstRes + numbers[j] == target && firstRes != numbers[j] ){
                    x[0] = j;
                    x[1] = i;
                }
            }
        }
        return x;
    }
}
