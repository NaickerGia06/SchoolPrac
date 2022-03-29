/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Gian
 */
public class Pirate { //protected fields?
    protected String surname;
    protected String firstName;
    protected String deck;
    protected String job;
    protected int grog;
    protected int limbs;

    public Pirate(String s, String n, String d, String j, int g, int l) {
        this.surname = s;
        this.firstName = n;
        this.deck = d;
        this.job = j;
        this.grog = g;
        this.limbs = l;
        
        
    }

    public void setDeck(String d) {
        this.deck = d;
    }

    public void setJob(String j) {
        this.job = j;
    }
    
    public String getName(){
        return this.surname + " " + this.firstName.charAt(0);
    }
    
    public int grogToMilli(){
        return this.grog * 350;
    }
    
    public String toString(){
        return "Name: " + this.getName() + "\n"
                + "Deck: " + this.deck + "\n"
                + "Job: " + this.job + "\n"
                + "Flagons: " + this.grog + "\n"
                + "Flagons: " + this.limbs;
    }
}
