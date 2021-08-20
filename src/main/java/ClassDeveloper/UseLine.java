/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDeveloper;
/**
 *
 * @author Gia Naicker
 */

import javax.swing.*;
public class UseLine {
    public static void main(String[] args) {
//        Line stripe = new Line();
//        stripe.draw();
//        stripe.length = 20;
//        stripe.draw();
//        stripe.character = '$';
//        stripe.draw();
//        Line stripe2 = new Line(15, '*');
//        stripe2.draw();
//        
//        System.out.println("");
//        
        
        int num1 = 5;
        int num2 = 15;
        System.out.println("");
        int num3 = sum(num1, num2);
        System.out.println(num3);
        
        
    }//main method
    
    public static int sum(int n, int m){
        System.out.println("");
        return n+m;
    }
}//UseLine class

/* ACTIVITY 2 AND 3

//default pattern is *
stripe.draw();
stripe.size = 5;
stripe.draw();
stripe.pattern = '&';
stripe.draw();

//ADD-ON FROM ACTIVITY 3
stripe.size = 60;
stripe.pattern = '=';
stripe.draw();

//STAR PATTERN - ACTIVITY 3
for(int i = 5; i > 0; i--){    
    stripe.size = i;
    stripe.pattern = '*';
    stripe.draw(); 
}
*/
            