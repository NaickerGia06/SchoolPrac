/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopTransactions;

/**
 *
 * @author Gia Naicker
 */
public class Transactions {

    private String name;
    private String surname;
    private int items;
    private double balance;
    private String pay;

    public Transactions(String name, String surname, int items, double balance, String pay) {
        this.name = name;
        this.surname = surname;
        this.items = items;
        this.balance = balance;
        this.pay = pay;
    }

    //NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //SURNAME
    public String getSurname() {
        return surname;
    }

    public void setSurmame(String surname) {
        this.surname = surname;
    }

    //ITEMS
    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    //BALANCE
    public double getBalance() {
        return balance;
    }

    public void setSurmame(double balance) {
        this.balance = balance;
    }

    //PAY
    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String toString() {
        return this.name + "*" + this.surname + "#" + this.items + "#" + this.balance + "#" + this.pay;
    }

    public boolean isQualified() {
        if (this.items > 15 && this.balance > 500) {
            return true;
        }
        return false;
    }

}
