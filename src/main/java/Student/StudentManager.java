/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Gia Naicker
 */
public class StudentManager {

    //Input from user and writes to a file
    //Scans text file and passes to object (Student s = new Student...)
    //Gets the highest exam mark and prints the object.
    public StudentManager() {
    }

    public void addStudent() {
        String name = JOptionPane.showInputDialog("Student name:");
        String surname = JOptionPane.showInputDialog("Student surname:");
        int grade = Integer.parseInt(JOptionPane.showInputDialog("Grade:"));
        int cass = Integer.parseInt(JOptionPane.showInputDialog("Cass mark:"));
        int exam = Integer.parseInt(JOptionPane.showInputDialog("Exam mark:"));

        //passes data into the Student object
        Student s = new Student(name, surname, grade, cass, exam);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\Student\\StudentDetails.txt", true));
            pw.println(s.logString());
            pw.close();
        } catch (IOException e) {
            System.out.println("An IO Exception was caught");
        }
    }//end of method addStudent();

    public void displayStudent() {
        try {
            Scanner fileSc = new Scanner(new File("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\Student\\StudentDetails.txt"));

            while (fileSc.hasNext()) {
                String line = fileSc.nextLine();

                Scanner lineSc = new Scanner(line).useDelimiter("%");
                //get every element
                String name = lineSc.next();
                String surname = lineSc.next();
                int grade = lineSc.nextInt();
                int cass = lineSc.nextInt();
                int exam = lineSc.nextInt();

                Student s = new Student(name, surname, grade, cass, exam);
                System.out.println(s.toString());

                lineSc.close();
            }

            fileSc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }//end of displayStudent();

    public void highestTerm() {
        try {
            Scanner fileSc = new Scanner(new File("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\Student\\StudentDetails.txt"));

            Student highest = null;
            while (fileSc.hasNext()) {
                String line = fileSc.nextLine();

                Scanner lineSc = new Scanner(line).useDelimiter("%");
                //get every element
                String name = lineSc.next();
                String surname = lineSc.next();
                int grade = lineSc.nextInt();
                int cass = lineSc.nextInt();
                int exam = lineSc.nextInt();
                lineSc.close();

                Student s = new Student(name, surname, grade, cass, exam);

                if (highest == null) {
                    highest = s;
                    //remember you cannot use method (unexpected type)
                }
                if (s.term() > highest.term()) {
                    highest = s;
                }
            }
            System.out.println("Student with the highest term mark: " + highest.term());
            System.out.println(highest.toString());

            fileSc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }//end of highestMark();

}
