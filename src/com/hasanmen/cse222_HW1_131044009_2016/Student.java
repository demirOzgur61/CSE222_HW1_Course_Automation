package com.hasanmen.cse222_HW1_131044009_2016;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 21.02.2016.
 */
public class Student extends User {


    private List<Course> takenCourses = new ArrayList<>();
    private List<Course> allSystemCourses = new ArrayList<>();
    private int studentID;
    public static final int NOT_FOUND = -1;

    public Student(Student copyStd){
        super(copyStd);

        this.takenCourses = new ArrayList<>(copyStd.getTakenCourses());
        this.takenCourses = new ArrayList<>(copyStd.getAllSystemCourses());
        this.studentID = copyStd.getStudentID();

    }

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

    public List<Course> getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(List<Course> takenCourses) {
        this.takenCourses = takenCourses;
    }

    public List<Course> getAllSystemCourses() {
        return allSystemCourses;
    }



    public void setAllSystemCourses(List<Course> allSystemCourses) {
        this.allSystemCourses = allSystemCourses;
    }

    /*
                Kurs için istekte bulunuldu o kursun içine istek olarak eklendi. Artık teacher gidip o istekleri onaylayınca
                ogrenci o kursa kaydolmuş olacak
             */
    public boolean enrolCourse(Course course) {

        int courseIndex = takenCourses.indexOf(course);
        // o derse kayıtlı degilse
        if(NOT_FOUND == courseIndex ){
            courseIndex = allSystemCourses.indexOf(course);
            if(NOT_FOUND != courseIndex) {
                allSystemCourses.get(courseIndex).joinCourse(this);
                return true;
            }else return false;
        }else return false;
    }

    public String toString() {
        return String.format(super.toString() + " Student ID : " + getStudentID());
    }
}
