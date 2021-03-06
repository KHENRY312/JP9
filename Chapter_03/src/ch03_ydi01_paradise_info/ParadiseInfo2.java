/* **************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_03
Package:       ch03_ydi01_paradise_info
File:              ParadiseInfo
Creator:        Kimberly Henry
Created on:   Sat, 06-Mar-2021
Created at:    4:59 PM
*/
package ch03_ydi01_paradise_info;

import java.util.Scanner;

public class ParadiseInfo2
   {
      public static void main(String[] args)
         {
            double price;
            double discount;
            double savings;
            Scanner keyboard =  new Scanner(System.in);
            System.out.print("Enter cutoff price for discount >> ");
            price = keyboard.nextDouble();
            System. out.print("Enter discount rate as a whole number >> ");
            discount = keyboard.nextDouble();
            displayInfo();
            savings = computeDiscountInfo(price, discount);
            System.out.println("Special this week on any service over " + price);
            System.out.println("Discount of " + discount + " percent.");
            System.out.println("That's a savings of at least $" + savings);
         }
      public static double computeDiscountInfo(double price, double discountRate)
         {
            return price * discountRate / 100;
         }
      public static void displayInfo()
         {
            System.out.println("Paradise Day Spa wants to pamper you.");
            System.out.println("We will make you look good.");
         }
   }
