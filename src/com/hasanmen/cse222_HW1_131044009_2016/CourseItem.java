package com.hasanmen.cse222_HW1_131044009_2016;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public abstract class CourseItem implements CourseAddable {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public CourseItem(String name) {
        this.name = name;
    }


    public abstract boolean updateCourseItem(CourseAddable newCourseItem);
}
