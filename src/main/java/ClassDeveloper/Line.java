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
public class Line {
    int length;
    char character;
    
    public Line (){ //default constructor/ no arg constructor
        length = 10;
        character = '£';
    }
    
    public Line (int len, char c){
        length = len;
        character = c;
    }
    
    public void draw(){
        for (int i =1; i<= length; i++){
            System.out.print(character);
        }
        System.out.println();
    }//drawMethod
    

}//Line class
