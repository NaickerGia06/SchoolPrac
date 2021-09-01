/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectArray;

import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Gia Naicker
 */
public class FriendArray {

    private Friend frArr[] = new Friend[25];
    private int size = 0;

    public FriendArray() {
        try {
            Scanner fs = new Scanner(new File("data//friends.txt"));
            String line;
            String name;
            String dob;

            while (fs.hasNext()) {
                line = fs.next();

                Scanner ls = new Scanner(line).useDelimiter("#");
                name = ls.next();
                dob = ls.next();
                ls.close();
                frArr[size] = new Friend(name, dob);

                size++;
            }
            fs.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found :(");
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < size; i++) {
            temp += frArr[i] + "\n";
        }
        return temp;
    }

    public void sort() {
        for (int currentPos = size - 1; currentPos > 0; currentPos--) {

            boolean sortedFlag = true;
            for (int i = 0; i < currentPos; i++) {
                if (frArr[i].getName().compareTo(frArr[i + 1].getName()) > 0) {

                    Friend temp = frArr[i];
                    frArr[i] = frArr[i + 1];
                    frArr[i + 1] = temp;
                    sortedFlag = false;
                }
            }
            if (sortedFlag) {
                break;
            }
        }
    }

    public void sortByAge() {
        for (int j = size - 1; j > 0; j--) {

            boolean sortedFlag = true;
            for (int currentPos = 0; currentPos < j; currentPos++) {
                if (frArr[currentPos].getAge() > frArr[j].getAge()) {

                    Friend temp = frArr[currentPos];
                    frArr[currentPos] = frArr[j];
                    frArr[j] = temp;
                    sortedFlag = false;
                }
            }

            if (sortedFlag) {
                break;
            }
        }
    }

    public int search(String f) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (frArr[middle].getName().equals(f)) {
                return middle;
            } else if (f.compareTo(frArr[middle].getName()) > 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

}
