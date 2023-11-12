package com.teachmeskills.lesson4.main_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    //Task 1 for the HM-4

    public static void main(String[] args) {
        System.out.println("Enter the array's length");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        double[] myArray = new double[length];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = Math.random();
        }
        Arrays.sort(myArray);
        System.out.println("Minimum value: " + myArray[0]);
        System.out.println("Average value: " + myArray[(length-1)/2]);
        System.out.println("Maximum value: " + myArray[length-1]);
        System.out.println(Arrays.toString(myArray));
    }

}
