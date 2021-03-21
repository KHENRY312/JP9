/***************************************************************************************************
 Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled
  or reproduced for other uses than educational; and not to be used in lieu of performing your
  own assignments.
 **************************************************************************************************/

/*
Project:         JP9
Module:        Game_Zone
Package:       ch02_gz02_mad_lib
File:              MadLib
Creator:        Kimberly Henry
Created on:   Tue, 23-Feb-2021
Created at:    8:33 PM
*/
package ch02_gz02_mad_lib;

import javax.swing.*;

public class MadLib
   {
      public static void main(String[] args)
         {

                            String petType;
                            String petBodyPart;
                            String color;
                            String pastTenseVerb;
                            String name;
                            name = JOptionPane.showInputDialog(null, "Enter your name:  ",
                                  "NAME", JOptionPane.QUESTION_MESSAGE);
                            petType = JOptionPane.showInputDialog(null, "Enter a type of pet:  ",
                                    "PET TYPE", JOptionPane.QUESTION_MESSAGE
                            );
                            petBodyPart = JOptionPane.showInputDialog(null, "Enter part of pets body:  ",
                                    "PETS BODY PART", JOptionPane.QUESTION_MESSAGE
                            );
                            color = JOptionPane.showInputDialog(null, "Enter color of pets body part:  ",
                                    "COLOR OF PET", JOptionPane.QUESTION_MESSAGE
                            );
                            pastTenseVerb = JOptionPane.showInputDialog(null, "Enter something you can do:  ",
                                    "PAST TENSE VERB", JOptionPane.QUESTION_MESSAGE
                            );
                            JOptionPane.showMessageDialog(null, name + " had a little " + petType +
                                  "\nIts " + petBodyPart + " was " + color + " as snow" +
                                  "\nAnd everywhere that" + " " + name + " " + pastTenseVerb +
                                  "\nThe " + petType + " was sure to go");
            System.exit(0);
         }
   }
