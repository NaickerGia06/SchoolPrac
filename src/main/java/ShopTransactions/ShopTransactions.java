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
import java.util.*;
import java.io.*;
import javax.swing.*;

public class ShopTransactions {

    public void nextRecord() {

        String name = JOptionPane.showInputDialog("Enter your name:");
        String surname = JOptionPane.showInputDialog("Enter your surname:");
        int noItems = Integer.parseInt(JOptionPane.showInputDialog("How many items were bought?"));
        double totalBalance = Double.parseDouble(JOptionPane.showInputDialog("Balance of transaction?"));
        String payMethod = JOptionPane.showInputDialog("Paid with cash or card?");
        Transactions tr = new Transactions(name, surname, noItems, totalBalance, payMethod);

        this.logTransactions(tr);
    }

    private void logTransactions(Transactions transactions) {
        try {
            PrintWriter outFile = new PrintWriter(new FileWriter("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\ObjectOrientatedProgramming\\src\\main\\java\\ShopTransactions\\CustomerDetails.txt"), true);
            outFile.println(transactions.toString());
            //can also use .append();
            outFile.close();

        } catch (IOException e) {
            System.out.println("IOException caught");
        }
    }

    private void getRecords() {

        try {
            Scanner fileSc = new Scanner(new File("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\ObjectOrientatedProgramming\\src\\main\\java\\ShopTransactions\\CustomerDetails.txt"));
            while (fileSc.hasNextLine()) {
                String line = fileSc.nextLine();

                Scanner lineSc = new Scanner(line).useDelimiter("#").useLocale(Locale.US);
                String fullName = lineSc.next();
                int items = lineSc.nextInt();
                double balance = lineSc.nextDouble();
                String pay = lineSc.next();

                Scanner nameSc = new Scanner(fullName).useDelimiter("[*]");
                String name = nameSc.next();
                String surname = nameSc.next();

                Transactions tr = new Transactions(name, surname, items, balance, pay);
                nameSc.close();

                System.out.println("Customer name:\t\t" + tr.getName());
                System.out.println("Customer's Surname:\t" + tr.getSurname());
                System.out.println("Number of items:\t" + tr.getItems());
                System.out.println("Balance:\t\t" + "R" + tr.getBalance());
                System.out.println("Paid with:\t\t" + tr.getPay());

                lineSc.close();
            }
            fileSc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    private void getQualifiedRecords() {

        try {
            Scanner fileSc = new Scanner(new File("C:\\Users\\Gia Naicker\\OneDrive\\Documents\\NetBeansProjects\\ObjectOrientatedProgramming\\src\\main\\java\\ShopTransactions\\CustomerDetails.txt"));
            while (fileSc.hasNextLine()) {
                String file = fileSc.nextLine();

                Scanner lineSc = new Scanner(file).useDelimiter("#").useLocale(Locale.US);
                String fullName = lineSc.next();
                int items = lineSc.nextInt();
                double balance = lineSc.nextDouble();
                String pay = lineSc.next();

                Scanner nameSc = new Scanner(fullName).useDelimiter("[*]");
                String name = nameSc.next();
                String surname = nameSc.next();

                Transactions tr = new Transactions(name, surname, items, balance, pay);
                nameSc.close();

                if (tr.isQualified()) {
                    System.out.println("Customer name:\t\t" + tr.getName());
                    System.out.println("Customer's Surname:\t" + tr.getSurname());
                    System.out.println("Number of items:\t" + tr.getItems());
                    System.out.println("Balance:\t\t" + "R" + tr.getBalance());
                    System.out.println("Paid with:\t\t" + tr.getPay());
                }
                lineSc.close();
            }
            fileSc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
    }

    public void customerDetails() {
        this.getRecords();
        System.out.println();
        this.getQualifiedRecords();
    }
}
