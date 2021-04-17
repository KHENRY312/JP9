/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex12a_student_showStudent_showStudent2;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex12a_student_showStudent_showStudent2
 * File:              Student
 * Creator:         Kimberly Henry
 * Created on:   Fri, 16-Apr-2021
 * Created at:    6:49 PM
 * Create a class named Student that has fields for an ID number, number of credit hours earned,
 * and number of points earned. (For example, many schools compute grade point averages based
 * on a scale of 4, so a three-credit-hour class in which a student earns an A is worth 12 points.)
 * Include methods to assign values to all fields. A Student also has a field for grade point average.
 * Include a method to compute the grade point average field by dividing points by credit hours
 * earned. Write methods to display the values in each Student field. Save this class as Student.java.
 */
public class Student
   {
      String idNumber;
      int creditHoursEarned;
      int pointsEarned;
      double gradePointAverage;
      public Student()
         {
            idNumber = "9999";
            creditHoursEarned = 3;
            pointsEarned = 12;
         }
      public String getIdNumber()
         {
            return idNumber;
         }
      public void setIdNumber(String id)
         {
            idNumber = id;
         }
      public int getCreditHoursEarned()
         {
            return creditHoursEarned;
         }
      public void setCreditHoursEarned(int che)
         {
            creditHoursEarned = che;
         }
      public int getPointsEarned()
         {
            return pointsEarned;
         }
      public void setPointsEarned(int pe)
         {
            pointsEarned = pe;
         }
      public void setGradePointAverage()
         {
            gradePointAverage = (double) getPointsEarned() / getCreditHoursEarned();
         }
      public double getGradePointAverage()
         {
            return gradePointAverage;
         }
   }
