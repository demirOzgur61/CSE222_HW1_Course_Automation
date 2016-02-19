package com.hasanmen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasan MEN on 19.02.2016.
 */
public class Assignment extends Uploads {

    private String deadline;
    private String lastDeadline;
    private List<Document> documents;

    public Assignment(String name, String deadline, String lastDeadline) {
        super(name);
        this.deadline = deadline;
        this.lastDeadline = lastDeadline;

        // Her ihtimale karsı exception fırlatsın
        try {
            documents = new ArrayList<Document>();
        } catch (OutOfMemoryError error) {
            System.out.println(error.getMessage());
            error.printStackTrace();
            System.exit(1);
        }
    }

    public String getDeadline() {
        return deadline;
    }

    public String getLastDeadline() {
        return lastDeadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setLastDeadline(String lastDeadline) {
        this.lastDeadline = lastDeadline;
    }

    // coklu olarak dosya eklenebilsin
    public Document[] addDocumentsToAssignment(Document... documents){
        for(Document d : documents){
            this.documents.add(d);
        }

       return  documents;
    }


}
