/* **************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 ***************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_02
Package:       ch02_ydi05_adding_string_input
File:              AddingStringInput
Creator:        Kimberly Henry
Created on:   Mon, 15-Feb-2021
Created at:    9:15 AM
*/
package ch02_ydi05_adding_string_input;

import java.util.Scanner;

public class AddingStringInput
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            String name;
            System.out.print("Please enter your name >>  ");
            name = keyboard.nextLine();
            System.out.println("Thank you, " + name);
         }
   }
