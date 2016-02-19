package com.hasanmen;

/**
 * Created by Hasan MEN on 19.02.2016.
 */
public class TestMain {


    public static void main(String... args){
        Course course = new Course("CSE 222");

        Assignment ass = new Assignment("HW01","15.2.2016","25.2.2016");

        course.uploadToCourse(ass.addDocumentsToAssignment(new Slide("LESSON1 SLIDE","1.1","KOFFMAN")));
        System.out.println(course.getName());

    }
}
