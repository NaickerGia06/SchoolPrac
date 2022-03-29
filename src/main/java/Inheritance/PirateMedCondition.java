/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Gian
 */
public class PirateMedCondition extends Pirate{
    
    private String medCondition;
    
    public PirateMedCondition(String s, String n, String d, String j, int g, int l, String mC){
        super(s, n, d, j, g, l);
        this.medCondition = mC;
    }

    @Override
    public int grogToMilli(){
        return super.grogToMilli() + 500;
    }
    
}
