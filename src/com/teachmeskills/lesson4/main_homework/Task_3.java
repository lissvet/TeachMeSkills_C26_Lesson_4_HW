package com.teachmeskills.lesson4.main_homework;

import java.util.Arrays;

public class Task_3 {
    //Task 1 for the HM-4

    public static void main(String[] args) {
        int[] one = {5, 7, 15, 77, 80};
        int[] two = {1, 35, 55, 89, 60};
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        int mean1 = 0;
        for(int i = 0; i < one.length; i++){
            mean1 = mean1 + one[i];
        }
        int mean2 = 0;
        for(int i = 0; i < two.length; i++){
            mean2 = mean2 + two[i];
        }
        if (mean1/2 < mean2/2){
            System.out.println("the arithmetic mean of the sum of numbers in the second array is greater");
        } else if (mean2/2 < mean1/2){
            System.out.println("the arithmetic mean of the sum of numbers in the first array is greater");
        } else {
            System.out.println("the arithmetic mean of the arrays are equal");
        }
    }

}
