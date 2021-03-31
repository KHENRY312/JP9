/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex06_bookstore_credit;

import java.util.Scanner;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex06_bookstore_credit
 * File:              BookstoreCredit
 * Creator:         Kimberly Henry
 * Created on:   Wed, 31-Mar-2021
 * Created at:    3:44 PM
 * To encourage good grades, Hermosa High School has decided to award each student a bookstore
 * credit that is 10 times the student’s grade point average. In other words, a student with a 3.2
 * grade point average receives a 32 credit. Create a class that prompts a student for a name and
 * grade point average, and then passes the values to a method that displays a descriptive message.
 * The message uses the student’s name, echoes the grade point average, and computes and displays
 * the credit. Save the application as BookstoreCredit.java.
 */
public class BookstoreCredit
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please Enter Your Name:  ");
            String name = keyboard.nextLine();
            System.out.print("What Is Your GPA:  ");
            double gpa = keyboard.nextDouble();
            calculateDiscount(name, gpa);
         }
      public static void calculateDiscount(String n, double g)
         {
            final double DISCOUNT_VALUE = 10;
            System.out.println("Student:  " + n);
            System.out.println("GPA:  " + g);
            double discount = g * DISCOUNT_VALUE;
            System.out.println("Your student discount is " + discount);
         }
   }
