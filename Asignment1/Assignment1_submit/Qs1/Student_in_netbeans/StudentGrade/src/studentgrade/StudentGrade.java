/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrade;

import java.util.Random;

/**
 *
 * @author jaspr_000
 */
public class StudentGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student stud1 = new Student("Priya");
        int hw1 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int mid1 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int finals1 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        stud1.setHomework(hw1);
        stud1.setMidterm(mid1);
        stud1.setFinals(finals1);
        String grade_priya = stud1.calculateGrade(hw1, mid1, finals1);
        System.out.println(stud1.toString());
        
        Student stud2 = new Student("Alex");
        int hw2 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int mid2 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int finals2 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        stud2.setHomework(hw2);
        stud2.setMidterm(mid2);
        stud2.setFinals(finals2);
        String grade_alex = stud2.calculateGrade(hw2, mid2, finals2);
        System.out.println(stud2.toString());
        
        Student stud3 = new Student("Shubham");
        int hw3 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int mid3 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int finals3 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        stud3.setHomework(hw3);
        stud3.setMidterm(mid3);
        stud3.setFinals(finals3);
        String grade_shubham = stud3.calculateGrade(hw3, mid3, finals3);
        System.out.println(stud3.toString());
        
        Student stud4 = new Student("Neha");
        int hw4 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int mid4 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int finals4 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        stud4.setHomework(hw4);
        stud4.setMidterm(mid4);
        stud4.setFinals(finals4);
        String grade_neha = stud4.calculateGrade(hw4, mid4, finals4);
        System.out.println(stud4.toString());
        
        Student stud5 = new Student("Deepanshi");
        int hw5 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int mid5 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        int finals5 = (int) ((Math.random() * (100 - 50 + 1)) + 50);
        stud5.setHomework(hw5);
        stud5.setMidterm(mid5);
        stud5.setFinals(finals5);
        String grade_deepanshi = stud5.calculateGrade(hw5, mid5, finals5);
        System.out.println(stud5.toString());
        
    }

}
