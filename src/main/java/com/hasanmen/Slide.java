package com.hasanmen;

/**
 * Created by Hasan MEN on 19.02.2016.
 */
public class Slide extends Document {
    private String creator; // who create slides

    public Slide(String creator) {
        this.creator = creator;
    }

    public Slide(String name, String revision, String creator) {
        super(name, revision);
        this.creator = creator;
    }
}
