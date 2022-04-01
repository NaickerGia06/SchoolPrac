/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.io.*;
import java.util.*;

/**
 *
 * @author Gian
 */
public class Recipe {
    private String rName;
    private String type;
    
    private Ingredient[] iArr;

    public Recipe(String rN, String t, Ingredient[] iA) {
        this.rName = rN;
        this.type = t;
        this.iArr = iA;
    }

    public String getrName() {
        return rName;
    }

    public Ingredient[] getiArr() {
        return iArr;
    }
    
    public String toString(){
        String temp = rName + "-" + type;
        for(int i = 0; i < iArr.length; i++){
            temp = temp + iArr[i] + "\n";
        }
        return temp;
    }
}
