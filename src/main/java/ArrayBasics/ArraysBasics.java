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
public class ArraysBasics {

    public static void main(String[] args) {
        int[] intArr = new int[10];
        int sum = 0;
        int average = 0;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random() * 11);

            System.out.println(intArr[i]);
        }

        for (int j = 0; j < intArr.length; j++) {
            sum += intArr[j];
        }
        average = sum / intArr.length;

        System.out.println(sum);
        System.out.println(average);

    }
}
