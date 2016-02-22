package com.hasanmen.cse222_HW1_131044009_2016;


import sun.plugin.dom.core.CoreConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Hasan MEN on 21.02.2016.
 */
public class Teacher extends User {

    private List<Course> givenCourses = new ArrayList<>();

    public Teacher(String name, String surName, String userName, String passWord, String eMail) {
        super(name, surName, userName, passWord, eMail);
    }

   /* public boolean acceptRequest(Student std){


    }*/

    public String showEnrolments(Course course){
        StringBuilder strBldr = new StringBuilder("");

        int index = givenCourses.indexOf(course);
        System.out.println(index);
        if(index != -1){
            for(int i=0;i<givenCourses.get(i).getCourseRequests().size();++i){
                strBldr.append(givenCourses.get(i).getCourseRequests().get(i));

            }

            return strBldr.toString();
        }else return null;


    }



    @Override
    public String toString() {
        return String.format("Teacher : Name -> " + getName() + " " + getSurName() + " - E-mail -> " + geteMail());
    }
}
