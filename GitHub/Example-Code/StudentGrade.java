//***************************************************************
// Author D.S. Malik
//
// Program to calculate the average test score.
// Given a student's name and five test scores, this program
// calculates the average test score. The student's name, the
// five test scores, and the average test score is stored in the
// file testavg.out. The data is input from the file test.txt.
//***************************************************************

import java.io.*;
import java.util.*;

public class StudentGrade
{
    public static void main(String[] args) throws FileNotFoundException
    {

          //declare and initialize the variables         //Step 1
        double test1, test2, test3, test4, test5;
        double average;
        String firstName;
        String lastName;

        Scanner inFile = new Scanner(new FileReader("test.txt"));      //File reader (input)

        PrintWriter outFile = new PrintWriter("testavg.out");   //File writer (output) 

        firstName = inFile.next();                       //Read the first name
        lastName = inFile.next();                        //Read the last name

        outFile.println("Student Name: " + firstName + " " + lastName);    //Step 5

        //Step 6 - retrieve the five test scores
        test1 = inFile.nextDouble();
        test2 = inFile.nextDouble();
        test3 = inFile.nextDouble();
        test4 = inFile.nextDouble();
        test5 = inFile.nextDouble();

        outFile.printf("Test scores: %5.2f %5.2f %5.2f " + "%5.2f %5.2f %n",
                test1, test2, test3, test4, test5); //Print out the test scores

        average = (test1 + test2 + test3 + test4 + test5) / 5.0; //Find the average of the tests
        outFile.printf("Average test score: %5.2f %n", average); //Print the test average
        outFile.println("\n");
              
        inFile.close(); //close input file
        outFile.close(); //close output file
    }
}

