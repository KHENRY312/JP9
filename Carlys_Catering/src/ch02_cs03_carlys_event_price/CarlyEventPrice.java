/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Carlys_Catering
Package:       ch02_cs03_carlys_event_price
File:              CarlyEventPrice
Creator:        Kimberly Henry
Created on:   Sat, 20-Feb-2021
Created at:    1:33 PM
Carly’s Catering provides meals for parties and special events. Write a program that prompts the
user for the number of guests attending an event and then computes the total price, which is $35
per person. Display the company motto with the border that you created in the CarlysMotto2 class
 in Chapter 1, and then display the number of guests, price per guest, and total price. Also, display
  a message that indicates true or false depending on whether the job is classified as a large event
  —an event with 50 or more guests. Save the file as CarlysEventPrice.java.
*/
package ch02_cs03_carlys_event_price;

import java.util.Scanner;

public class CarlyEventPrice
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            final double PRICE = 35.00;
            System.out.println("*********************************************");
            System.out.println("Carly’s makes the food that makes it a party.");
            System.out.println("*********************************************");
            System.out.println("How many guest will be attending your event?  ");
            int guestAttending =  keyboard.nextInt();
            double cost = PRICE * guestAttending;
            System.out.println("Total cost for guest attending will be $" + cost + ".");
            System.out.println("*********************************************");
         }
   }
