/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrade;

/**
 *
 * @author jaspr_000
 */
public class Student {
    
    private String name;
    private int id;
    private int homework;
    private int midterm;
    private int finals;
    private static int nextId=1;
    private String grade;
    
    public Student(){
        nextId++;
        this.id = nextId;
    }
    
    public Student(String name){
        nextId++;
        this.id = nextId;
        this.name = name+String.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHomework() {
        return homework;
    }

    public void setHomework(int homework) {
        this.homework = homework;
    }

    public int getMidterm() {
        return midterm;
    }

    public void setMidterm(int midterm) {
        this.midterm = midterm;
    }

    public int getFinals() {
        return finals;
    }

    public void setFinals(int finals) {
        this.finals = finals;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }
    
    public String calculateGrade(int homework, int midterm, int finals){
        double score = (40*homework/100) + (30*midterm/100) + (30*finals/100);
        if(score>=95 && score<=100){
            this.grade = "A";
            return "A";
        }
        else if(score>=83 && score<=94){
            this.grade = "B";
            return "B";
        }
        else if(score>=75 && score<=82){
            this.grade = "C";
            return "C";
        }
        else if(score>=65 && score<=74){
            this.grade = "D";
            return "D";
        }
        else if(score>=55 && score<=64){
            this.grade = "E";
            return "E";
        }
        else{
            this.grade = "F";
            return "F";
        }
    }
    
    public String getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", homework=" + homework + ", "
                + "midterm=" + midterm + ", finals=" + finals + ", Grade=" + grade + '}';
    }
}
