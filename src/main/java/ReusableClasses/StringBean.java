/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReusableClasses;

/**
 *
 * @author Gia Naicker
 */
import javax.swing.*;
import java.util.*;

public class StringBean {

    private String str;

    public StringBean(String s) {
        this.str = s;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String s) {
        this.str = s;
    }

    public String toString() {
        return str;
    }

    public int countWords() {
        Scanner sc = new Scanner(this.str);
        int count = 0;
        while (sc.hasNext()) {
            sc.next();
            count++;
        }
        sc.close();
        return count;
    }

    public String firstCaps() {
        return "";
    }

}
