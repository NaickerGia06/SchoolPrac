/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Gian
 */
public class Ingredient {
    private int qty;
    private String unit;
    private String name;

    public Ingredient(int q, String u, String n) {
        this.qty = q;
        this.unit = u;
        this.name = n;
    }

    public int getQty() {
        return qty;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String toString(){
        return name + " " + qty + " " + unit;
    }
    
}
