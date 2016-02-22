package com.hasanmen.cse222_HW1_131044009_2016;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class Admin extends User {

    private List<Course> systemCourses = null; // erisileblinen kurslar
    private List<User> systemUsers = null;

    public Admin(String name, String surName, String userName, String passWord, String eMail) {
        super(name, surName, userName, passWord, eMail);
        systemCourses = new ArrayList<>();
        systemUsers = new ArrayList<>();
    }

    private List<User> getSystemUsers() {
        return systemUsers;
    }

    private List<Course> getSystemCourses() {
        return systemCourses;
    }

    public void setSystemCourses(List<Course> systemCourses) {
        this.systemCourses = systemCourses;
    }

    public void setSystemUsers(List<User> systemUsers) {
        this.systemUsers = systemUsers;
    }

    /**
     * This funciton adds course to the system. If there are courses, has the same name
     * won't add course to the system.
     *
     * @param course course which trying to add system
     * @return status of adding courses to system
     */
    public boolean addCourse(Course course) {
        if (null != course) {
            if (!getSystemCourses().contains(course)) {
                getSystemCourses().add(course);
                return true;
            }
        }
        return false;
    }


    /**
     * THIS FUNCTION ASSIGN TEACHER TO COURSE
     * If admin couldn't not see teacher in system adds new teacher in system and adds in the courses
     * Firstly adds in system then copy references of teacher to course so they will be synchronized.
     *
     * @param course where teacher will add
     * @param user   which teacher will add in course and in system
     * @return if add teacher is successfull return true otherwise return false
     */
    public boolean addTeacher(Course course, User user) {
        if (user instanceof Teacher) {
            // if there is course in the system
            if (null != course && getSystemCourses().contains(course)) {
                // If not in the system add system and then add course
                if (!getSystemUsers().contains(user)) {
                    getSystemUsers().add(user);
                    course.getCourseTeachers().add(getSystemUsers().get(getSystemUsers().indexOf(user)));
                    return true;
                    // If teacher is in the system, check course and than add
                } else {
                    if (!course.getCourseTeachers().contains(user)) {
                        course.getCourseTeachers().add(getSystemUsers().get(getSystemUsers().indexOf(user)));
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * THIS FUNCTION ADDS TEACHER TO THE SYSTEM
     *
     * @param user copy of teacher
     * @return return adding status
     */
    public boolean addTeacher(User user) {
        if (user instanceof Teacher) {
            if (!getSystemUsers().contains(user)) {
                getSystemUsers().add(user);
                return true;
            }
        }
        return false;
    }


    /*public boolean addStudent(User user) {
        if (user instanceof Student) {
            getAccessibleUsers().add(user);
            return true;
        } else return false;
    }*/

    @Override
    public String toString() {
        return String.format("## ADMIN ## Name : " + getName() + " Surname : " + getSurName() + " eMail : " + geteMail());
    }


}
