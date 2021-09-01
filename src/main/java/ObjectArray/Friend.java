/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectArray;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gia Naicker
 */
public class Friend {

    private String name;
    private Date dob;

    public Friend(String n, Date d) {
        name = n;
        dob = d;
    }

    public Friend(String n, String d) {
        try {
            this.name = n;
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            this.dob = s.parse(d);
        } catch (ParseException ex) {
            Logger.getLogger(Friend.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        Date today = new Date();
        return today.getYear() - this.dob.getYear();
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setDob(Date d) {
        this.dob = d;
    }

    public String toString() {
        return this.name + " " + this.dob;
    }

    public int compareTo(Friend friend) {
        return this.name.compareTo(friend.getName());
    }
}
