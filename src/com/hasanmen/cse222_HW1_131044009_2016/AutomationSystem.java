package com.hasanmen.cse222_HW1_131044009_2016;

import com.hasanmen.cse222_HW1_131044009_2016.Course.Course;
import com.hasanmen.cse222_HW1_131044009_2016.User.Admin;
import com.hasanmen.cse222_HW1_131044009_2016.User.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class AutomationSystem {

    private String name;

    private List<Course> courses = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    /**
     * Sistem ilk acildiginda bir admin ekler
     */
    public AutomationSystem(String name) {
        this.name = name;
        users.add(new Admin("Hasan", "MEN", "hmenn", "hasan5669", "hmen@gtu.edu.tr"));
    }

    @Override
    public String toString(){
        return String.format(name +" : Number of users -> "+users.size()+ " - Number of Courses -> "+courses.size() );
    }


    public User login(String userName, String passWord) {
        for (User usrItr : users) {
            if (userName.equals(usrItr.getUserName()) && passWord.equals(usrItr.getPassWord())) {
                usrItr.setAccessibleCourses(courses);
                usrItr.setAccessibleUsers(users);
                return usrItr;
            }
        }
        return null;
    }
}
