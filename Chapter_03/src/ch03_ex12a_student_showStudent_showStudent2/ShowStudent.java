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
 * File:              ShowStudent
 * Creator:         Kimberly Henry
 * Created on:   Fri, 16-Apr-2021
 * Created at:    10:35 PM
 * Write a class named ShowStudent that instantiates a Student object from the class you created
 * and assign values to its fields. Compute the Student grade point average, and then display all
 * the values associated with the Student. Save the application as ShowStudent.java.
 */
public class ShowStudent
   {
      public static void main(String[] args)
         {
            Student firstStudent = new Student();
            firstStudent.setIdNumber("3729");
            firstStudent.setCreditHoursEarned(15);
            firstStudent.setPointsEarned(36);
            firstStudent.setGradePointAverage();
            JOptionPane.showMessageDialog(null, "\nStudent Id:  " + firstStudent.getIdNumber() +
                        "\nCredit Hours Earned:   " + firstStudent.getCreditHoursEarned() +
                        "\nPoints Earned:  " + firstStudent.getPointsEarned() +
                        "\nGrade Point Avg:   " + firstStudent.getGradePointAverage() + "",
                  "STUDENT TRANSCRIPT", JOptionPane.INFORMATION_MESSAGE);
         }
   }
