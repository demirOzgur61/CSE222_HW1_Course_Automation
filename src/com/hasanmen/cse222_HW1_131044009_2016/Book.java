package com.hasanmen.cse222_HW1_131044009_2016;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class Book extends Document {
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Book(String name, String authorName, int size) {
        super(name, size);
        this.authorName = authorName;
    }

    @Override
    public boolean updateCourseItem(CourseAddable newCourseItem) {
        if (newCourseItem instanceof Book) {
            Book tempBook = (Book) newCourseItem;
            setName(tempBook.getName()); // isimlerini ata
            setAuthorName(tempBook.getAuthorName());
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return String.format("BOOK -> Name : " + getName() + " - AuthorName : " + getAuthorName() + " - Size : " + getSize());
    }
}
