/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Gia Naicker
 */
public class NumArrayUI {

    public static void main(String[] args) {
        NumArray a = new NumArray();
        a.bubbleSort();
        a.print();
        a.insert(42);
        a.print();
        a.deleteDupes();
        a.print();
    }
}
