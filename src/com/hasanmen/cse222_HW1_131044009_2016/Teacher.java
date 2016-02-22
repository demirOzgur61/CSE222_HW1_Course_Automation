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

    @Override
    public String toString() {
        return String.format("Teacher : Name -> " + getName() + " " + getSurName() + " - E-mail -> " + geteMail());
    }
}
