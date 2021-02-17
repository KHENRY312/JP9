/* **************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 ***************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ydi06_arithmetic_demo
File:              ArithmeticDemo
Creator:        Kimberly Henry
Created on:   Wed, 17-Feb-2021
Created at:    2:00 AM
*/
package ch02_ydi06_arithmetic_demo;

import java.util.Scanner;

public class ArithmeticDemo
   {
      public static void main(String[] args)
         {
            int firstNumber;
            int secondNumber;
            int sum;
            int difference;
            int average;
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter an integer >> ");
            firstNumber = keyboard.nextInt();
            System.out.print("Please enter another integer >> ");
            secondNumber = keyboard.nextInt();
            sum = firstNumber + secondNumber;
            difference = firstNumber - secondNumber;
            average = sum / 2;
            System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
            System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
            System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
         }
   }
