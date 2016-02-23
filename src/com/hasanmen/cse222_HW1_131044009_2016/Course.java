package com.hasanmen.cse222_HW1_131044009_2016;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class Course{
    private static int COURSE_ID = 0;
    private String name;
    private int courseID;
    private List<User> courseTeachers = new ArrayList<>();
    private List<User> courseStudents = new ArrayList<>();
    public List<User> courseRequests = new ArrayList<>();
    private List<CourseItem> courseItems = new ArrayList<>();


    public Course(Course copy){
        this.name = copy.name;
        this.courseID = copy.getCourseID();
        this.courseTeachers = new ArrayList<>(copy.getCourseTeachers());
        this.courseStudents = new ArrayList<>(copy.getCourseStudents());
        this.courseRequests = new ArrayList<>(copy.getCourseRequests());
        this.courseItems = new ArrayList<>(copy.getCourseItems());
    }

    public Course(String name) {
        this.name = name;
        ++COURSE_ID;
        courseID = COURSE_ID;
    }

    public String getName() {
        return name;
    }

    public List<CourseItem> getCourseItems() {
        return courseItems;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
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

    public List<User> getCourseRequests() {
        return courseRequests;
    }

    public void setCourseRequests(List<User> courseRequests) {
        this.courseRequests = courseRequests;
    }

    public int getTeacherIndex(User teacher){
        return getCourseTeachers().indexOf(teacher);
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder("\nCourse : " + getName());
        for (int i = 0; i < getCourseTeachers().size(); ++i) {
            str.append("\n\t\t" + getCourseTeachers().get(i));
        }

        return str.toString();
    }

    public boolean joinCourse(Student student) {
        // take copy of user with call by value and add in request list
        if (student != null && !courseRequests.contains(student)) {
            courseRequests.add(student);
            return true;
        } else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return name != null ? name.equals(course.name) : course.name == null;
    }

    public boolean deleteMe(User user){
        if(null != user){

        }
        return false;
    }

    public boolean addCourseItem(CourseItem item){
        if(null != item){
            courseItems.add(item);
            return true;
        }
        return false;
    }

    public String showItems(){
        StringBuilder strBldr = new StringBuilder();

        strBldr.append(getName() + " Couse Items : \n");
        for(CourseItem itr : courseItems){
            strBldr.append("\t"+itr+"\n");
        }
        return strBldr.toString();
    }

}
