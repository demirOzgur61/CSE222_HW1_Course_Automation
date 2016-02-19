package com.hasanmen;

/**
 * Created by Hasan MEN on 19.02.2016.
 */
public  abstract class Document extends Uploads {

    public Document(){
        super("UNNAMED DOCUMENT");
    }

    private String revision; // dosyanın sürümü

    public Document(String name, String revision) {
        super(name);
        this.revision = revision;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }
}
