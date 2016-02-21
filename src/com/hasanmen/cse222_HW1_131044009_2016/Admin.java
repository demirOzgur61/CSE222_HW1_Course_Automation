package com.hasanmen.cse222_HW1_131044009_2016;

import java.util.List;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class Admin extends User {

    private AutomationSystem administratorSystem;
    private List<User> systemUsers;

    public Admin(String name, String surName, String userName, String passWord, String eMail) {
        super(name, surName, userName, passWord, eMail);
    }

    public boolean addCourse(Course course) {
        if (null != course) {
            getAccessibleCourses().add(course);
            return true;
        }
        return false;
    }

    public boolean addTeacher(Course course, User user) {
        if (user instanceof Teacher) {
            if (null != course){
                course.getCourseTeachers().add(user);
                return true;
            }
            return true;
        } else return false;
    }

    public boolean addStudent(User user){
        if(user instanceof Student){
            getAccessibleUsers().add(user);
            return true;
        }else return false;
    }


}
