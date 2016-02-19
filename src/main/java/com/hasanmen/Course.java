package com.hasanmen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 18.02.2016.
 */
public class Course {
    private String name;
    private List<Uploads> uploads;

    public Course(String name) {
        this.name = name;
        try {
            uploads = new ArrayList<Uploads>();
        } catch (OutOfMemoryError error) {
            System.err.println(error.getMessage());
            error.printStackTrace();
            System.exit(1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void uploadToCourse(Uploads... uploads) {
        for (Uploads up : uploads)
            this.uploads.add(up);
    }
}
