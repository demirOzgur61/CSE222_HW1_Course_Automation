package com.hasanmen.cse222_HW1_131044009_2016;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class AutomationSystem  implements Cloneable{



    // name of course automation system
    private String name;

    // courses in the automation system
    private List<Course> courses = new ArrayList<>();

    // users in automation system
    private List<User> users = new ArrayList<>();


    /**
     * CONSTRUCTOR  : CREATES SYSTEM AND ADDS ONE DEFAULT ADMIN
     *
     * @param name name of course automation system
     */
    public AutomationSystem(String name) {
        this.name = name;
        users.add(new Admin("Hasan", "MEN", "hmenn", "hasan5669", "hmen@gtu.edu.tr"));
    }


    /**
     * Creates a string which include contents of system end returns.
     */
    @Override
    public String toString() {

        StringBuilder strBldr = new StringBuilder();
        strBldr.append(name + " : Number of users -> " + users.size() + " - Number of Courses -> " + courses.size() +
                "\n\tAll courses in system :");

        for (int i = 0; i < courses.size(); ++i) {
            strBldr.append("\n\t" + courses.get(i));

        }
        return strBldr.toString();
    }


    /**
     * Compares information and if the user in the system returns a reference of user. Other wise returns null
     *
     * @param userName username of user
     * @param passWord password of user
     * @return reference of user or null
     */
    public User login(String userName, String passWord) {
        for (User usrItr : users) {
            if (userName.equals(usrItr.getUserName()) && passWord.equals(usrItr.getPassWord())) {
                if (usrItr instanceof Admin) {
                    Admin logedAdmin = (Admin) usrItr;
                    logedAdmin.setSystemCourses(courses);
                    logedAdmin.setSystemUsers(users);
                    return logedAdmin;
                } else if (usrItr instanceof Teacher) {
                    Teacher logedTeacher = (Teacher) usrItr;
                    return logedTeacher;
                } else if (usrItr instanceof Student) {
                    Student logedStudent = (Student) usrItr;
                    logedStudent.setAllSystemCourses(courses);
                    return logedStudent;
                }
                return null;
            }
        }
        return null;
    }
}
