/* **************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 ***************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ydi07_performing_floating_point_arithmetic
File:              ArithmeticDemo2
Creator:        Kimberly Henry
Created on:   Mon, 15-Feb-2021
Created at:    9:32 AM
*/
package ch02_ydi07_performing_floating_point_arithmetic;

import java.util.Scanner;

public class ArithmeticDemo2
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter an double >>  ");
            double anDouble = keyboard.nextDouble();
            System.out.print("Please enter a byte  >>  ");
            byte aByte = keyboard.nextByte();
            System.out.print("Please enter a short integer >>  ");
            short aShort = keyboard.nextShort();
            System.out.print("Please enter a long integer >> ");
            long aLong = keyboard.nextLong();
            System.out.println("The int is " + anDouble + ".");
            System.out.println("The byte is " + aByte + ".");
            System.out.println("The short is " + aShort + ".");
            System.out.println("The long is " + aLong + ".");
            double anotherDouble =  anDouble * 1000000;
            System.out.println("anotherDouble is " + anotherDouble + ".");
         }
   }
