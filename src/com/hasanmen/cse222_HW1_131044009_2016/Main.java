package com.hasanmen.cse222_HW1_131044009_2016;


import com.hasanmen.cse222_HW1_131044009_2016.Course.Course;
import com.hasanmen.cse222_HW1_131044009_2016.User.Admin;
import com.hasanmen.cse222_HW1_131044009_2016.User.Teacher;
import com.hasanmen.cse222_HW1_131044009_2016.User.User;

public class Main {
    public static void main(String... args){
        Admin admin=null;
        User user=null;


        AutomationSystem GTUStudentSystem = new AutomationSystem("Gebze Technical University Moodle System");
        User loginUser = GTUStudentSystem.login("hmenn","hasan5669");


        if(loginUser instanceof Admin ){
            admin = (Admin) loginUser;
        }

        admin.addCourse(new Course("CSE222"));

        admin.getAccessibleCourses().get(0).getCourseTeachers().add(new Teacher("Fatih Erdogan","Sevilgen","ferdogansev","123","ferdogan@gtu.edu.tr"));
        admin.getAccessibleCourses().get(0).getCourseTeachers().add(new Teacher("Fatih Erdogan","Sevilgen","ferdogansev","123","ferdogan@gtu.edu.tr"));
        System.out.println(admin.getAccessibleCourses().get(0));

        System.out.println(GTUStudentSystem);







    }
}
