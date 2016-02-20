package com.hasanmen.cse222_HW1_131044009_2016.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class Course {
    private static int COURSE_ID=0;
    private String name;
    private int courseID;
    private List<CourseItem> courseItems = new ArrayList<>();

    public Course(String name) {
        this.name = name;
        ++COURSE_ID;
        courseID= COURSE_ID;
    }


}
