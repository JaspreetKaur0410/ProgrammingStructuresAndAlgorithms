/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;


public class Student {
   
    String studentId;
    String firstName;
    String lastName;
    String course;

    public Student(String studentId, String firstName, String lastName, String course) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;

    }

    @Override
    public String toString() {
        return "Student" + studentId + "{" + "id=" + studentId + ", fName=" + firstName + ", lName=" + lastName + ", course=" + course + '}';
    }

}


