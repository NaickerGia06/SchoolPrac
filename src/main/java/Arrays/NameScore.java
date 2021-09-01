/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Gia Naicker
 */
public class NameScore {

    private int[] numArr = new int[150];
    private String[] names = new String[150];
    private int size;
    private String scoreFile = "C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\NumArrays\\TestScores.txt";
    private String nameFile = "C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\NumArrays\\Names.txt";

    public NameScore() {
        //TESTSCORES TEXT FILE
        try {
            Scanner sc = new Scanner(new File(scoreFile));
            while (sc.hasNextInt()) {
                numArr[size] = sc.nextInt();
                size++;
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("The File was not found.");
        }

        //NAMES TEXT FILE
        try {
            Scanner sc = new Scanner(new File(nameFile));
            size = 0;

            while (sc.hasNext()) {
                names[size] = sc.next();
                size++;
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("The File was not found.");
        }

    }

    public void update() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(scoreFile, false));
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

                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = temp;

                    int intTemp = numArr[j + 1];
                    numArr[j + 1] = numArr[j];
                    numArr[j] = intTemp;
                }
            }
        }
        this.update();
    }//bubbleSort

    public void bubbleSortImproved() {
        for (int currentIndex = size - 1; currentIndex >= 0; currentIndex--) {

            boolean sortedFlag = true;
            for (int j = 0; j < currentIndex; j++) {

                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j + 1];
                    numArr[j + 1] = numArr[j];
                    numArr[j] = temp;
                    sortedFlag = false;
                }
            }
            if (sortedFlag) {
                break;
            }
        }
    }//bubbleSortImproved

    public int binarySearch(String name) {
        //this.bubbleSort();
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (names[middle].equals(name)) {
                return middle;
            } else if (names[middle].compareTo(name) > 0) {
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
            System.out.print(names[i] + "\t");
        }
        System.out.println("");
        for (int j = 0; j < size; j++) {
            System.out.print(numArr[j] + "\t");
        }
        System.out.println("\n");
    }

    //ARRAY MANIPULATION
    public int insert(String num) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (names[i].compareTo(num) > 0) {
                index = i;
                break;
            }
        }
        this.shiftRight(index);
        names[index] = num;
        this.update();
        return index;
    }

    public void delete(String name) {
        int index = this.binarySearch(name);
        if (index >= 0) {
            this.shiftLeft(index);
        }
        this.update();
    }

    //FIX THIS METHOD
    public void deleteDupes() {
        for (int i = 0; i < size - 1; i++) {
            if (names[i].compareTo(names[i + 1]) == 0) {
                this.shiftLeft(i + 1);
                i--;
            }
        }
        this.update();
    }

    private void shiftLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            names[i] = names[i + 1];
        }
        size--;
    }

    private void shiftRight(int index) {
        size++;
        for (int i = size - 1; i > index; i--) {
            names[i] = names[i - 1];
        }
    }
}
