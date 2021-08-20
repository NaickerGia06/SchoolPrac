/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumArrays;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gia Naicker
 */
public class NumArray {

    private int[] numArr = new int[150];
    private int size;
    private String fileName = "C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\NumArrays\\TestScores.txt";

    public NumArray() {
        try {
            //do we have to get it from another file or JOptionPane
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextInt()) {
                numArr[size] = sc.nextInt();
                size++;
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("The File was not found.");
        }

    }

    public void update() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName, false));
            for (int i = 0; i < size; i++) {
                pw.print(numArr[i] + " ");
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("File Not Found");
        }
    }

    public void selectionSort() {
        for (int currentIndex = 0; currentIndex < size; currentIndex++) {

            int lowIndex = currentIndex;
            for (int j = currentIndex; j < size; j++) {

                if (numArr[j] < numArr[lowIndex]) {
                    lowIndex = j;
                    int temp = numArr[currentIndex];
                    numArr[currentIndex] = numArr[lowIndex];
                    numArr[lowIndex] = temp;
                }

            }
        }
    }//selectiveSort

    public void selectionSortImproved() {
        for (int currentIndex = 0; currentIndex < size; currentIndex++) {

            int lowIndex = currentIndex;
            for (int j = currentIndex; j < size; j++) {

                if (numArr[j] < numArr[lowIndex]) {
                    lowIndex = j;
                }
            }

            int temp = numArr[currentIndex];
            numArr[currentIndex] = numArr[lowIndex];
            numArr[lowIndex] = temp;
        }
    }//selectiveSortImproved

    public void bubbleSort() {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {

            for (int j = 0; j < currentIndex; j++) {

                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j + 1];
                    numArr[j + 1] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }
        this.update();
    }//bubbleSort

    public void bubbleSortImproved() {
        for (int i = size - 1; i >= 0; i--) {

            boolean sortedFlag = true;
            for (int j = 0; j < size; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[i + 1];
                    sortedFlag = false;
                }

            }
            if (sortedFlag) {
                break;
            }
        }
    }//bubbleSortImproved

    public int binarySearch(int val) {
        //this.bubbleSort();
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (numArr[middle] == val) {
                return middle;
            } else if (numArr[middle] > val) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    public int linearSearch(int val) {

        for (int i = 0; i < size; i++) {

            if (numArr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println("");
    }

    //AARRAY MANIPULATION
    public int insert(int num) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (numArr[i] > num) {
                index = i;
                break;
            }
        }
        this.shiftRight(index);
        numArr[index] = num;
        this.update();
        return index;
    }

    public int delete(int num) {
        int index = this.binarySearch(num);
        if (index >= 0) {
            this.shiftLeft(index);
        }
        this.update();
        return index;
    }

    //FIX THIS METHOD
    public void deleteDupes() {
        for (int i = 0; i < size - 1; i++) {
            if (numArr[i] == numArr[i + 1]) {
                this.shiftLeft(i + 1);
                i--;
            }
        }
        this.update();
    }

    private void shiftLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            numArr[i] = numArr[i + 1];
        }
        size--;
    }

    private void shiftRight(int index) {
        size++;
        for (int i = size - 1; i > index; i--) {
            numArr[i] = numArr[i - 1];
        }
    }
}
