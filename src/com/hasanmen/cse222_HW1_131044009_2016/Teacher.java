package com.hasanmen.cse222_HW1_131044009_2016;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 21.02.2016.
 */
public class Teacher extends User {

    private List<Course> givenCourses = new ArrayList<>();
    public static final int NOT_FOUND = -1;

    public Teacher(String name, String surName, String userName, String passWord, String eMail) {
        super(name, surName, userName, passWord, eMail);
    }

    public List<Course> getGivenCourses() {
        return givenCourses;
    }


    public String showEnrolments(Course course) {
        StringBuilder strBldr = new StringBuilder("");

        int index = givenCourses.indexOf(course);
        if (NOT_FOUND != index) {
            for (int i = 0; i < givenCourses.get(index).getCourseRequests().size(); ++i) {
                strBldr.append(givenCourses.get(index).getCourseRequests().get(i).toString() + "\n");
            }
            return strBldr.toString();
        } else return null;
    }

    public boolean acceptEnrolment(Course course, User student) {

        if (course instanceof Course && student instanceof Student) {
            int indexOfCourse = getGivenCourses().indexOf(course);
            Course realCourse = getGivenCourses().get(indexOfCourse);
            int indexOfSudent = getGivenCourses().get(indexOfCourse).courseRequests.indexOf(student);
            User realStudent = getGivenCourses().get(indexOfCourse).courseRequests.get(indexOfSudent);

            // find user in general list and add him/her to course. TO SAVE REFERANCES
            addStudent(realCourse, realStudent);

            // remove request
            getGivenCourses().get(indexOfCourse).courseRequests.remove(indexOfSudent);

            return true;
        } else return false;
    }

    private boolean addStudent(Course course, User student) {
        course.getCourseStudents().add(student);
        return true;
    }

    public String showCourseStudents(Course course) {
        if (null != course) {
            int indexOfCourse = getGivenCourses().indexOf(course);
            if (NOT_FOUND != indexOfCourse) {
                StringBuilder strBldr = new StringBuilder();
                for (int i = 0; i < getGivenCourses().get(indexOfCourse).getCourseStudents().size(); ++i) {
                    strBldr.append(getGivenCourses().get(indexOfCourse).getCourseStudents().get(i) + "\n");
                }
                return strBldr.toString();
            }


        }
        return null;

    }

    @Override
    public String toString() {
        return String.format("Teacher : Name -> " + getName() + " " + getSurName() + " - E-mail -> " + geteMail());
    }

    public boolean addCourseItem(Course course, CourseItem item) {
        if (null != item && null != course) {
            int indexOfCourse = givenCourses.indexOf(course);
            if (NOT_FOUND != indexOfCourse) {
                givenCourses.get(indexOfCourse).addCourseItem(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public String showCourseItems(Course course) {
        if (null != course) {
            int indexOfCourse = givenCourses.indexOf(course);
            if (NOT_FOUND != indexOfCourse) {
                return givenCourses.get(indexOfCourse).showItems();
            }
        }
        return null;
    }

}
