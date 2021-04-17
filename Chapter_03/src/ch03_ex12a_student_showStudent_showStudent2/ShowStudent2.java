/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

package ch03_ex12a_student_showStudent_showStudent2;

import javax.swing.*;

/**
 * Project:         JP9
 * Module:        Chapter_03
 * Package:       ch03_ex12a_student_showStudent_showStudent2
 * File:              ShowStudent2
 * Creator:         Kimberly Henry
 * Created on:   Fri, 16-Apr-2021
 * Created at:    11:00 PM
 * Create a constructor for the Student class you created. The constructor should initialize each
 * Student’s ID numbers to 9999, his or her points earned to 12, and credit hours to 3 (resulting in
 * a grade point average of 4.0). Write a program that demonstrates that the constructor works by
 * instantiating an object and displaying the initial values. Save the application as
 * ShowStudent2.java.
 */
public class ShowStudent2
   {
      public static void main(String[] args)
         {
            Student secondStudent = new Student();
            secondStudent.setGradePointAverage();
            JOptionPane.showMessageDialog(null, "\nStudent Id:  " + secondStudent.getIdNumber() +
                        "\nCredit Hours Earned:   " + secondStudent.getCreditHoursEarned() +
                        "\nPoints Earned:  " + secondStudent.getPointsEarned() +
                        "\nGrade Point Avg:   " + secondStudent.getGradePointAverage() + "",
                  "STUDENT TRANSCRIPT", JOptionPane.INFORMATION_MESSAGE);
         }
   }
