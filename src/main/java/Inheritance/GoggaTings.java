/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;
import it.Gogga;
import java.awt.Color;
/**
 *
 * @author Gian
 */
public class GoggaTings extends Gogga {
    
    public GoggaTings(){
        super();
        setColor(Color.CYAN);
    }
    
    //Gets input for size of square side and draws a square
    public void makeSquare(int size){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < size; j++){
                move();
            }
            turnLeft();
        }
    }

}
