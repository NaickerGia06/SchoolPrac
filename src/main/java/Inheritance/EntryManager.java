/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.io.*;
import java.util.*;

/**
 *
 * @author Gian
 */
public class EntryManager {

    Entry[] entArr = new Entry[50];
    private int size = 0;

    public EntryManager() {
        try {
            Scanner fileSc = new Scanner(new File("data//Entries.txt"));
            while (fileSc.hasNext()) {
                String line = fileSc.nextLine();
                Scanner lineSc = new Scanner(line);
                String name = lineSc.next();
                String number = lineSc.next();
                String email = "";
                Entry e = null;

                if (lineSc.hasNext()) {
                    email = lineSc.next();
                    e = new EmailEntry(name, number, email);
                } else {
                    e = new Entry(name, number);
                }

                entArr[size] = e;
                size++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("The file was not found");
        }

    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += entArr[i].toString() + "\n";
        }
        return output;
    }

}
