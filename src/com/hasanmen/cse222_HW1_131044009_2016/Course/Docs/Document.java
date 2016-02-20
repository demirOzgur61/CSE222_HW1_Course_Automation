package com.hasanmen.cse222_HW1_131044009_2016.Course.Docs;

import com.hasanmen.cse222_HW1_131044009_2016.Course.CourseAddable;
import com.hasanmen.cse222_HW1_131044009_2016.Course.CourseItem;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public abstract class Document extends CourseItem {

    // Dokuman boyutu
    private int size;

    public int getSize() {
        return size;
    }

    // CONSTRUCTOR
    public Document(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public  abstract boolean updateCourseItem(CourseAddable newCourseItem);
}
