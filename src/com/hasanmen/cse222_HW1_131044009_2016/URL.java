package com.hasanmen.cse222_HW1_131044009_2016;

/**
 * Created by Hasan MEN on 24.02.2016.
 */
public class URL extends CourseItem{
    private String urlAddress;

    public URL(String name,String urlAddress) {
        super(name);
        this.urlAddress = urlAddress;
    }

    public String getUrlAddress() {
        return urlAddress;
    }

    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
    }

    @Override
    public boolean updateCourseItem(CourseAddable newCourseItem) {
        if (newCourseItem instanceof URL) {
            URL newURL = (URL) newCourseItem;
            setName(newURL.getName()); // isimlerini ata
            setUrlAddress(newURL.getUrlAddress());
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return String.format("URL -> Name : "+getName() +" Address : "+getUrlAddress());
    }
}
