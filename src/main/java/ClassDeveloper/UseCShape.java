/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDeveloper;

import ClassDeveloper.Line;

/**
 *
 * @author Gia Naicker
 */
public class UseCShape {
    
    public Line horizontal;
    public Line vertical;
    
    public UseCShape(){
        horizontal = new Line (10, '&');
        vertical = new Line (2, '^');
    }
    
    public static void main(String[] args) {
        System.out.println("Draws CShape Pattern:");
        /*horizontal.drawHorizontal();
        for(int i = 0; i < 4; i++){
            vertical.drawVertical();
        }
        horizontal.drawHorizontal(); */
    }
}
  