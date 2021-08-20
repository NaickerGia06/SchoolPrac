/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Gia Naicker
 */
public class Person {

    private String name;
    private double height;
    private double weight;
    private int age;

    public Person(String name, double height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age >= -1) {
            this.age = age;
        } else {
            this.age = -1;
        }
    }

    public String logString() {
        return this.name + "#" + this.height + "#" + this.weight + "#" + this.age;
    }

    public String toString() {
        String output = "";
        output += "Name: " + "\t" + this.name + "\n" + "Height: " + "\t" + this.height
                + "\n" + "Weight: " + "\t" + this.weight + "\n" + "Age: " + "\t" + this.age;
        return output;
    }

    public double bmi() {
        double bmi = this.weight / (this.height * this.height);
        return bmi;
    }

}
