/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Gian
 */
public class EmailEntry extends Entry{
    private String email;
    
    public EmailEntry(String n, String cell, String e){
        super(n, cell);
        this.email = e;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        this.email = e;
    }
    
    public String toString(){
        return super.toString() + ", " + email;
    }
}
