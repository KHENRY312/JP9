/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex10_job_pricing;

import javax.swing.*;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex10_job_pricingDO
 * File:              JobPricing
 * Creator:         Kimberly Henry
 * Created on:   Thu, 15-Apr-2021
 * Created at:    6:11 AM
 * Herbert’s Home Repair estimates each job cost as the cost of materials plus 35.00 per hour while
 * on the job, plus 12.00  each hour for travel time to the job site. Create a class that contains a main()
 * method that prompts the user for the name of a job (for example, Smith bathroom remodel), the
 * cost of materials, the number of hours of work required, and the number of hours travel time.
 * Pass the numeric data to a method that computes estimate for the job and returns the computed
 * value to the main() method where the job name and estimated price are displayed. Save the
 * program as JobPricing.java.
 */
public class JobPricing
   {
      public static void main(String[] args)
         {
            String jobName = JOptionPane.showInputDialog(null, "Enter the Job Name:  ",
                  "ACTIVE JOB", JOptionPane.QUESTION_MESSAGE);
            double materialCost = Double.parseDouble(JOptionPane.showInputDialog(null, "Material " +
                  "Cost For Job:  ", "JOB COST", JOptionPane.QUESTION_MESSAGE));
            int travelTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Total Travel Time:  ",
                  "TRAVEL TIME", JOptionPane.QUESTION_MESSAGE));
            int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog(null, "Hours Worked",
                  "HOURS WORKED", JOptionPane.QUESTION_MESSAGE));
            double jobEstimate = jobEstimate(materialCost, travelTime, hoursWorked);
            JOptionPane.showMessageDialog(null, "Job Name:  " + jobName + "\nJob Estimate: " +
                  jobEstimate + "", "JOB ESTIMATE", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
      public static double jobEstimate(double mc, int tp, int hw)
         {
            final double TRAVEL_RATE = 12.00;
            final double HOURLY_RATE = 35.00;
            double hourlyPay = hw * HOURLY_RATE;
            double travelPay = tp * TRAVEL_RATE;
            return mc + hourlyPay + travelPay;
         }
   }
