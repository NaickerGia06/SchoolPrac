/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Gian
 */
public class Entry {
    protected String name, cellNo;

    public Entry(String n, String cell) {
        this.name = n;
        this.cellNo = cell;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cell) {
        this.cellNo = cell;
    }
    
    public String toString(){
        return name + ", " + cellNo;
    }
}
