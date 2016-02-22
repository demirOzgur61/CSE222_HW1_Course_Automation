package com.hasanmen.cse222_HW1_131044009_2016;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public abstract class User {

    protected static int TOTAL_USER_ID = 0;


    public String name = null;
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
     * @param o Karsilastirilacak USER INSTACE i olmali
     * @return Esitlik durumunu return eder
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (surName != null && surName.equals(user.getSurName()) &&
                name!=null && name.equals(user.getName())) return true;
        else return false;
    }


    @Override
    public String toString() {
        return String.format(" Name :" + getName() + " " + getSurName() +
                " Username : " + getUserName() + " eMail : " + geteMail());
    }
}
