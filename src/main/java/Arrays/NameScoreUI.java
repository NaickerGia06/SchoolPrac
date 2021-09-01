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
public class NameScoreUI {

    public static void main(String[] args) {
        NameScore a = new NameScore();
        a.print();
        a.bubbleSort();
        a.print();
        a.delete("Gia");
        a.print();
    }
}
