package com.hasanmen;

/**
 * Created by Hasan MEN on 19.02.2016.
 */
public abstract class Uploads {
    private String name;

    public Uploads(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
