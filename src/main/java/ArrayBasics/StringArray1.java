/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBasics;

/**
 *
 * @author Gia Naicker
 */
import javax.swing.*;

public class StringArray1 {

    public static void main(String[] args) {
        String[] stringArr = new String[5];
        String temp = "";

        //QUESTION 1.1
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = JOptionPane.showInputDialog("Enter a name");

            if (stringArr[i].length() > 6) {
                System.out.println("Name longer than 6 letters:\n" + stringArr[i]);
            }
        }

        //QUESTION 1.2
        for (int i = 0; i < stringArr.length; i++) { //add length - 1?

            if (stringArr[i].compareTo(stringArr[i + 1]) < 0) {
                temp = stringArr[i];
                stringArr[i] = stringArr[i + 1];
                stringArr[i + 1] = temp;
            }

        }
        System.out.println("The longest name is: " + temp);
    }
}
//NOTE: You have to use a for loop to populate an array
