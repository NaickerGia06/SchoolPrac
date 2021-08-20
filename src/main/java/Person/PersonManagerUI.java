/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Gia Naicker
 */
public class PersonManagerUI {

    public static void main(String[] args) {
        PersonManager pm = new PersonManager();
        pm.addPerson();
        pm.displayPeople();
        pm.highestBMI();
    }
}
