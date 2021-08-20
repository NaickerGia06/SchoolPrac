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
import java.util.*;
import java.io.*;

public class ToIntArray {

    public static void main(String[] args) throws IOException {
        int arr[] = new int[10];
        Scanner sc = new Scanner(new File("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\Arrays\\ArrayNums.txt"));

        while (sc.hasNextInt()) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
