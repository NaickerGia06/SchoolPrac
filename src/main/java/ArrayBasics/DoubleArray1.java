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

public class DoubleArray1 {

    public static void main(String[] args) {
        double[] doubleArr = new double[10];
        double average = 0.0;

        //QUESTION 1.1
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = (Math.random() * 50) + 1;
        }

        //QUESTION 1.2
        for (int j = 0; j < doubleArr.length; j++) {
            System.out.println(doubleArr[j]);
        }

        //QUESTION 1.3
        for (int k = 0; k < doubleArr.length; k++) {
            if (doubleArr[k] > 26.5) {
                System.out.println("\nNumber higher than 26.5:\n" + doubleArr[k]);
            }
        }

        //QUESTION 1.4
        for (int l = 0; l < doubleArr.length; l++) {
            average = doubleArr[l] / doubleArr.length;
        }
        System.out.println(average);

        //QUESTION 1.5
        System.out.println("\nThe average is: " + average);
        System.out.println("Numbers less than the average: ");

        for (int m = 0; m < doubleArr.length; m++) {
            if (doubleArr[m] < average) {
                System.out.println(doubleArr[m]);
            }
        }

        //QUESTION 1.6 DONE
        for (int m = 0; m < doubleArr.length; m++) {
            if (doubleArr[m] < average) {
                System.out.println(doubleArr[m]);
            }
        }
    }
}
