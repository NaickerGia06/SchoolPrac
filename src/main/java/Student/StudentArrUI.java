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
public class StudentArrUI {

    public static void main(String[] args) {
        StudentArray sa = new StudentArray();
        sa.print();
        sa.selectionSort();
        sa.print();
    }
}
