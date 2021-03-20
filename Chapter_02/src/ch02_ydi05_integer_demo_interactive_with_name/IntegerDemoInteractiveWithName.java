/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ydi05_integer_demo_interactive_with_name
File:              IntegerDemoInteractiveWithName
Creator:        Kimberly Henry
Created on:   Mon, 15-Feb-2021
Created at:    9:15 AM
*/
package ch02_ydi05_integer_demo_interactive_with_name;

import java.util.Scanner;

public class IntegerDemoInteractiveWithName
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            String name;
            System.out.print("Please enter your name >>  ");
            name = keyboard.nextLine();
            System.out.print("Please enter an integer >>  ");
            int anInt = keyboard.nextInt();
            System.out.print("Please enter a byte integer >>  ");
            byte aByte = keyboard.nextByte();
            System.out.print("Please enter a short integer >>  ");
            short aShort = keyboard.nextShort();
            System.out.print("Please enter a long integer >> ");
            long aLong = keyboard.nextLong();
            System.out.println("The int is " + anInt + ".");
            System.out.println("The byte is " + aByte + ".");
            System.out.println("The short is " + aShort + ".");
            System.out.println("The long is " + aLong + ".");
            int anotherInt =  anInt * 1000000;
            System.out.println("anotherInt is " + anotherInt + ".");
            System.out.println("Thank you, " + name);
            System.exit(0);
         }
   }
