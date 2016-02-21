package com.hasanmen.cse222_HW1_131044009_2016.User;

import com.hasanmen.cse222_HW1_131044009_2016.Course.Course;

import java.util.List;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public abstract class User {

    protected static int TOTAL_USER_ID = 0;
    private List<Course> accessibleCourses = null; // erisileblinen kurslar
    private List<User> accessibleUsers = null;
    private String name = null;
    private String surName = null;
    private String userName = null;
    private String eMail = null;
    private String passWord = null;
    private int userID;

    public User(String name, String surName, String userName, String passWord, String eMail) {
        this.name = name;
        this.surName = surName;
        this.userName = userName;
        this.eMail = eMail;
        this.passWord = passWord;
        this.userID = TOTAL_USER_ID;
        ++TOTAL_USER_ID;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String geteMail() {
        return eMail;
    }

    public List<Course> getAccessibleCourses() {
        return accessibleCourses;
    }

    public List<User> getAccessibleUsers() {
        return accessibleUsers;
    }

    public void setAccessibleCourses(List<Course> accessibleCourses) {
        this.accessibleCourses = accessibleCourses;
    }

    public void setAccessibleUsers(List<User> accessibleUsers) {
        this.accessibleUsers = accessibleUsers;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getUserID() {
        return userID;
    }

    /**
     * Gelen obje ile USERNAME VE PASSWORD ayni ise true return  edecek.Diger durumlarda false return eder
     *
     * @param obj Karsilastirilacak USER INSTACE i olmali
     * @return Esitlik durumunu return eder
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User tempUsr = (User) obj;
            if (userName.equals(tempUsr.getUserName()) && passWord.equals(tempUsr.getPassWord())) {
                return true;
            } else return false;
        } else return false;
    }
}
