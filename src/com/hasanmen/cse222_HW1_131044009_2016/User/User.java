package com.hasanmen.cse222_HW1_131044009_2016.User;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public abstract class User {

    protected static int USER_ID = 0;
    private String name;
    private String surName;
    private String userName;
    private String eMail;
    private String passWord;
    private int userID;

    public User(int userID, String name, String surName, String userName, String passWord, String eMail) {
        this.name = name;
        this.surName = surName;
        this.userName = userName;
        this.eMail = eMail;
        this.passWord = passWord;
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    /**
     * Gelen obje ile USERNAME VE PASSWORD ayni ise true return  edecek.Diger durumlarda false return eder
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
