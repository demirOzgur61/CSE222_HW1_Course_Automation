package com.hasanmen.cse222_HW1_131044009_2016;

/**
 * Created by Hasan MEN on 21.02.2016.
 */
public class Student extends User {

    private int studentID;

    public Student(String name, String surName, String userName, String passWord, String eMail, int studentID) {
        super(name, surName, userName, passWord, eMail);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }



    public String toString(){
        return String.format(super.toString() + "Student ID : " +getStudentID() );


    }
}
