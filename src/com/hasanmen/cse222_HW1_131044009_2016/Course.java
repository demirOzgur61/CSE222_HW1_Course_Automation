package com.hasanmen.cse222_HW1_131044009_2016;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class Course {
    private static int COURSE_ID = 0;
    private String name;
    private int courseID;
    private List<User> courseTeachers = new ArrayList<>();
    private List<User> courseStudents = new ArrayList<>();
    private List<CourseItem> courseItems = new ArrayList<>();

    public Course(String name) {
        this.name = name;
        ++COURSE_ID;
        courseID = COURSE_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseID() {
        return courseID;
    }

    public List<User> getCourseTeachers() {
        return courseTeachers;
    }

    public void setCourseTeachers(List<User> courseTeachers) {
        this.courseTeachers = courseTeachers;
    }

    public List<User> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(List<User> courseStudents) {
        this.courseStudents = courseStudents;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder("Course : " + getName());

        for (int i = 0; i < getCourseTeachers().size(); ++i) {
            str.append("\n\t\t" + getCourseTeachers().get(i));
        }

        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return name != null ? name.equals(course.name) : course.name == null;
    }
}
