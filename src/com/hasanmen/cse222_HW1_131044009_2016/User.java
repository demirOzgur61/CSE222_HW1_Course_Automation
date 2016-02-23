package com.hasanmen.cse222_HW1_131044009_2016;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public abstract class User implements  UserInterface{

    protected static int TOTAL_USER_ID = 0;

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

    // COPY CONSTRUCTOR
    public User(User user){
        this.name = user.getName();
        this.surName = user.getSurName();
        this.userName =user.getUserName();
        this.eMail = user.geteMail();
        this.passWord = user.getPassWord();
        this.userID =user.getUserID();
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

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getUserID() {
        return userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * Gelen obje ile USERNAME VE PASSWORD ayni ise true return  edecek.Diger durumlarda false return eder
     *
     * @param o Karsilastirilacak USER INSTACE i olmali
     * @return Esitlik durumunu return eder
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (surName != null && surName.equals(user.getSurName()) &&
                name != null && name.equals(user.getName())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return String.format(" Name :" + getName() + " " + getSurName() +
                " Username : " + getUserName() + " eMail : " + geteMail());
    }

    // WILL BE OVERRIDE
    public abstract String showCourseItems(Course course);


}
