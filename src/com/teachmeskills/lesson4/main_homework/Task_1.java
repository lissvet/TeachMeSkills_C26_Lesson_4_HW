package com.teachmeskills.lesson4.main_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    //Task 1 for the HM-4

    public static void main(String[] args) {
        int[] numbers = {50, 77, 12, 44, 69, 2, 5, 7, 19};
        System.out.println("Enter number that needs to be removed from the array: ");
        Scanner scan = new Scanner(System.in);
        int unn = scan.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == unn){
                int[] numbersDel = new int[numbers.length-1];
                int d = 0;
                for(int e = 0; e < numbers.length; e++){
                    if (numbers[e] != unn){
                        numbersDel[d] = numbers[e];
                        d++;
                    }
                }
                System.out.println("Array after delete: ");
                System.out.println(Arrays.toString(numbersDel));
                return;
            } else if (i == numbers.length - 1){
                System.out.println("This number is not in the array");
            }
        }
    }

}
