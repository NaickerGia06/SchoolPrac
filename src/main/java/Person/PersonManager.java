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
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonManager {

    public PersonManager() {

    }

    public void addPerson() {
        String name = JOptionPane.showInputDialog("Name");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Height"));
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Weight"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Age"));

        Person p = new Person(name, height, weight, age);

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\Person\\PersonDetails.txt", true));
            pw.println(p.logString());
            pw.close();
        } catch (IOException ex) {
            System.out.println("An IO Exception was caught");
        }
    }

    public void displayPeople() {
        try {
            Scanner scFile = new Scanner(new File("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\Person\\PersonDetails.txt"));
            while (scFile.hasNext()) {
                String line = scFile.nextLine();

                Scanner scLine = new Scanner(line).useDelimiter("#").useLocale(Locale.US);
                String name = scLine.next();
                double height = scLine.nextDouble();
                double weight = scLine.nextDouble();
                int age = scLine.nextInt();
                scLine.close();

                Person p = new Person(name, height, weight, age);
                System.out.println(p.toString());
            }
            scFile.close();

        } catch (IOException ex) {
            System.out.println("An IO Exception was caught");
        }
    }

    public void highestBMI() {
        try {
            Scanner scFile = new Scanner(new File("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\PracticePrac\\src\\main\\java\\Person\\PersonDetails.txt"));

            Person highestPerson = null;

            while (scFile.hasNext()) {
                String line = scFile.nextLine();

                Scanner scLine = new Scanner(line).useDelimiter("#").useLocale(Locale.US);
                String name = scLine.next();
                double height = scLine.nextDouble();
                double weight = scLine.nextDouble();
                int age = scLine.nextInt();
                scLine.close();

                Person p = new Person(name, height, weight, age);
                if (highestPerson == null) {
                    highestPerson = p;
                }

                if (p.bmi() > highestPerson.bmi()) {
                    highestPerson = p;
                }

            }
            System.out.println("\nHighest BMI: " + highestPerson.toString());
            scFile.close();

        } catch (IOException ex) {
            System.out.println("An IO Exception was caught");
        }
    }

}
