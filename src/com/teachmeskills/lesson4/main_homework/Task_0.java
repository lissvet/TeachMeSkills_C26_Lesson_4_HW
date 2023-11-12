package com.teachmeskills.lesson4.main_homework;

import java.util.Scanner;

public class Task_0 {
 //Task 1 for the HM-4

    public static void main(String[] args) {
       int [] integer = new int[10];
        integer[0] = 15;
        integer[1] = 66;
        integer[2] = 78;
        integer[3] = 91;
        integer[4] = 50;
        integer[5] = 60;
        integer[6] = 3;
        integer[7] = 18;
        integer[8] = 9;
        integer[9] = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for search in the array:");
        int number = scan.nextInt();
        for(int i = 0; i < integer.length; i++){
          if (integer[i] == number){
            System.out.println("This number is in the array at position: " + i);
            return;
          } else if (i == (integer.length - 1)) {
            System.out.println("This number isn't in the array");
          }
        }
    }

}
