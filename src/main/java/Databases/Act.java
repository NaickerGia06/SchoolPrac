/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;

/**
 *
 * @author Gian
 */
public class Act {
    private int actNum;
    private String actName;
    private String category;
    private double sponsorshipAmount;
    private boolean propsNeeded;

    public int getActNum() {
        return actNum;
    }

    public void setActNum(int actNum) {
        this.actNum = actNum;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getSponsorshipAmount() {
        return sponsorshipAmount;
    }

    public void setSponsorshipAmount(double sponsorshipAmount) {
        this.sponsorshipAmount = sponsorshipAmount;
    }

    public boolean isPropsNeeded() {
        return propsNeeded;
    }

    public void setPropsNeeded(boolean propsNeeded) {
        this.propsNeeded = propsNeeded;
    }

    public Act(int actNum, String actName, String category, double sponsorshipAmount, boolean propsNeeded) {
        this.actNum = actNum;
        this.actName = actName;
        this.category = category;
        this.sponsorshipAmount = sponsorshipAmount;
        this.propsNeeded = propsNeeded;
    }
}
