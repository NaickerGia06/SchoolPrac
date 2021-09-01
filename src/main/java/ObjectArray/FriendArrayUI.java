/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectArray;

/**
 *
 * @author Gia Naicker
 */
public class FriendArrayUI {

    public static void main(String[] args) {
        FriendArray fa = new FriendArray();

        fa.sort();
        System.out.println(fa.toString());
        System.out.println(fa.search("Ryan"));
    }
}
