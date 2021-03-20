/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ydi07_arithmetic_demo2
File:              ArithmeticDemo2
Creator:        Kimberly Henry
Created on:   Wed, 17-Feb-2021
Created at:    2:30 AM
*/
package ch02_ydi07_arithmetic_demo2;

import java.util.Scanner;

public class ArithmeticDemo2
   {
      public static void main(String[] args)
         {
            double firstNumber;
            double secondNumber;
            double sum;
            double difference;
            double average;
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter a double >> ");
            firstNumber = keyboard.nextDouble();
            System.out.print("Please enter another double >> ");
            secondNumber = keyboard.nextDouble();
            sum = firstNumber + secondNumber;
            difference = firstNumber - secondNumber;
            average = sum / 2;
            System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
            System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
            System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
            System.exit(0);
         }
   }
