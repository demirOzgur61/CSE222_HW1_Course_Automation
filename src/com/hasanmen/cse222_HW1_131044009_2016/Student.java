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
        if(-1 == courseIndex ){
            courseIndex = allSystemCourses.indexOf(course);
            if(-1 != courseIndex) {
                allSystemCourses.get(courseIndex).courseRequests(this);
                return true;
            }else return false;
        }else return false;
    }

    public String toString() {
        return String.format(super.toString() + " Student ID : " + getStudentID());
    }
}
