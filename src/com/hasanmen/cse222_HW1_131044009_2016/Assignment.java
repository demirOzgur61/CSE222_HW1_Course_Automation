package com.hasanmen.cse222_HW1_131044009_2016;

/**
 * Created by Hasan MEN on 20.02.2016.
 */
public class Assignment extends CourseItem {
    private String deadLine;
    private String lateDeadLine;
    private int asssingmentSize;
    private static final int maxAssignmentSize = 50;

    public String getDeadLine() {
        return deadLine;
    }

    public String getLateDeadLine() {
        return lateDeadLine;
    }

    public int getAsssingmentSize() {
        return asssingmentSize;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public void setLateDeadLine(String lateDeadLine) {
        this.lateDeadLine = lateDeadLine;
    }

    public void setAsssingmentSize(int asssingmentSize) {
        this.asssingmentSize = asssingmentSize;
    }

    public Assignment(String name, String deadLine, String lateDeadLine, int asssingmentSize) {
        super(name);
        this.deadLine = deadLine;
        this.lateDeadLine = lateDeadLine;
        this.asssingmentSize = asssingmentSize;
    }

    @Override
    public boolean updateCourseItem(CourseAddable newCourseItem) {

        if (newCourseItem instanceof Assignment) {
            Assignment tempAssingment = (Assignment) newCourseItem;

            setName(tempAssingment.getName());
            setDeadLine(tempAssingment.getDeadLine());
            setLateDeadLine(tempAssingment.getLateDeadLine());
            setAsssingmentSize(tempAssingment.getAsssingmentSize());

            return true;
        } else return false;

    }
}
