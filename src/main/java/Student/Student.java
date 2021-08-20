/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Gia Naicker
 */
public class Student {

    private String name;
    private String surname;
    private int grade;
    private int cass;
    private int exam;

    public Student(String name, String surname, int grade, int cass, int exam) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.cass = cass;
        this.exam = exam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCass() {
        return cass;
    }

    public void setCass(int cass) {
        this.cass = cass;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    //calculates term mark
    public int term() {
        int term = (this.cass + this.exam) / 2;
        return term;
    }

    public String logString() {
        //what will be added to the textFile
        return this.name + "%" + this.surname + "%" + this.grade + "%" + this.cass + "%" + this.exam;
    }

    public String toString() {
        //this.name etc, basically prints out the fields of the objects in a pretty form
        String output = "Name\t\tSurname\t\tGrade\t\tCass\t\tExam\t\t" + "\n"
                + this.name + "\t\t" + this.surname + "\t\t" + this.grade + "\t\t" + this.cass + "\t\t" + this.exam + "\n";
        return output;
    }

}

//question to ask sir
