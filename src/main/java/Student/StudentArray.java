/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Gia Naicker
 */
import javax.swing.*;
import java.io.*;
import java.util.*;

public class StudentArray {

    private String[] students = new String[5];
    private int size;

    public StudentArray() {
        for (int i = 0; i < students.length; i++) {
            students[i] = JOptionPane.showInputDialog("Enter a name");
            size++;
        }
    }

    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println("");
    }

    public void bubbleSort() {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {
            for (int i = 0; i < currentIndex; i++) {
                if (students[i].compareTo(students[i + 1]) > 0) {
                    String temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
        }//end outer loop
    }

    public void bubbleSortImproved() {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {

            boolean sorted = true;

            for (int i = 0; i < currentIndex; i++) {
                if (students[i].compareTo(students[i + 1]) > 0) {
                    String temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    sorted = false;
                }
            }//end inner loop

            if (sorted) {
                break;
            }
        }//end outer loop
    }

    public void selectionSort() {
        for (int currentIndex = 0; currentIndex < size; currentIndex++) {

            int lowestPos = currentIndex;
            for (int i = currentIndex; i < size; i++) {

                if (students[i].compareToIgnoreCase(students[lowestPos]) < 0) {
                    lowestPos = i;
                    String temp = students[currentIndex];
                    students[currentIndex] = students[lowestPos];
                    students[lowestPos] = temp;
                }
            }
        }
    }

    public void selectionSortImproved() {

    }

}
