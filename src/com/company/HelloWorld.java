package com.company;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String response = "";
        do {
           System.out.println("Enter an exam score:");
           int score = keyboard.nextInt();
           keyboard.nextLine();
           if ((score <= 100)&&(score>=97)) {
               System.out.println("Good job. Your grade is A+");
           }
          else if ((score <= 96)&&(score>=94)) {
               System.out.println("Good job. Your grade is A");
           }
          else if ((score <= 93)&&(score>=90)) {
               System.out.println("Good job. Your grade is A-");
           }
           else if ((score <=89)&&(score >=87)) {
                System.out.println("Good job. Your grade is B+");
            }
          else if ((score <= 86)&&(score>=84)) {
               System.out.println("Good job. Your grade is B");
           }
           else if ((score <= 83)&&(score>=80)) {
               System.out.println("Good job. Your grade is B-");
           }
          else if ((score <= 79)&&(score>=77)) {
               System.out.println("Good job. Your grade is C+");
           }
          else if ((score <= 76)&&(score>=74)) {
               System.out.println("Good job. Your grade is C");
           }
           else if ((score <= 73)&&(score>=70)) {
               System.out.println("Good job. Your grade is C-");
           }
          else if ((score <= 69)&&(score>=60)) {
               System.out.println("Good job. Your grade is D");
           }
          else if ((score < 60)&&(score>0)) {
               System.out.println("Go back to school if you get below 60");
           }
           else{
               System.out.println("That is not a valid exam score");
           }
           System.out.println("Do you want to enter another score (Y/N)?");
            response = keyboard.next();
       }while(!response.equalsIgnoreCase("n"));
    }
}
