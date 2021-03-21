/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ex14_dollars
File:              Dollars
Creator:        Kimberly Henry
Created on:   Sat, 20-Feb-2021
Created at:    2:53 AM
Write a program that calculates and displays the conversion of an entered number of dollars into
 currency denominations—20s, 10s, 5s, and 1s. Save the program as Dollars.java.
*/
package ch02_ex14_dollars;

import java.util.Scanner;

public class Dollars
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner (System.in);
            final double TWENTY = 20.00;
            final double TEN = 10.00;
            final double FIVE = 5.00;
            final double ONE = 1.00;

            int twenties, tens, fives, ones;
            System.out.println("Enter Dollar Amount:  ");
            double money = keyboard.nextDouble();
            keyboard.nextLine();
            twenties = (int) (money / TWENTY);
            double money1 =  money - (twenties * TWENTY);
            tens = (int)(money1 / TEN);
            double money2 = money1 - (tens * TEN);
            fives = (int)(money2 / FIVE);
            double money3  =  money2 - (fives * FIVE);
            ones = (int)(money3 / ONE);

            System.out.println(money + " has " + twenties +
                  " twenties, " + tens + " tens, " + fives +
                  " fives and " + ones + " ones.");
            System.exit(0);
         }
   }
