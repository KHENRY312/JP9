/* *************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
 or reproduced for other uses than educational; and not to be used in lieu of performing your
 own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Chapter_03
Package:       ch03_ydi04_spa_service
File:              CreateSpaServices
Creator:        Kimberly Henry
Created on:   Sat, 06-Mar-2021
Created at:    5:45 PM
*/
package ch03_ydi04_spa_service;

import java.util.Scanner;

public class CreateSpaServices
   {
      public static void main(String[] args)
         {
            String service;
            double price;
            SpaService firstService = new SpaService();
            SpaService secondService = new SpaService();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter service name --> ");
            service = keyboard.nextLine();
            System.out.println("Enter price of service --> ");
            price = keyboard.nextDouble();
            firstService.setServiceDescription(service);
            firstService.setPrice(price);
            keyboard.nextLine();
            System.out.println("Enter service name --> ");
            service = keyboard.nextLine();
            System.out.println("Enter price of service --> ");
            price = keyboard.nextDouble();
            secondService.setServiceDescription(service);
            secondService.setPrice(price);
            System.out.println("First Service Details");
            System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
            System.out.println();
            System.out.println("Second Service Details");
            System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
         }
   }
