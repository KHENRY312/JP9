/* **************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Sammys_Seashore_Supplies
Package:       ch02_cs03_sammys_rental_price
File:              SammysRentalPrice
Creator:        Kimberly Henry
Created on:   Mon, 22-Feb-2021
Created at:    4:06 AM
*/
package ch02_cs03_sammys_rental_price;

import java.util.Scanner;

public class SammysRentalPrice
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("********************************");
            System.out.println("Sammy’s makes it fun in the sun.");
            System.out.println("********************************");
            final double HOUR_COST = 40.00;
            final int HOUR = 60;
            System.out.println("Please enter minutes you leased the equipment?  ");
            int time = keyboard.nextInt();
            double leaseCost =  ((time / HOUR) * HOUR_COST) + (time % HOUR);
            System.out.println("Total cost of the lease is " + leaseCost);
         }
   }
