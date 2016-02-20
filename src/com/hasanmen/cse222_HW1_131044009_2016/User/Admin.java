package com.hasanmen.cse222_HW1_131044009_2016.User;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class Admin extends User {



    public Admin(String name,String surName,String userName, String passWord,String eMail){
        super(USER_ID,name,surName,userName,passWord,eMail);
        ++USER_ID;
    }


}
