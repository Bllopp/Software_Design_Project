package CourseOrganisation;

import java.util.ArrayList;

public class Course {
    private int courseID;
    private String title;
    private double price;
    private String content;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getContent() {
        return content;
    }

    public int getCourseID() {
        return courseID;
    }

    public Course(int courseID, String title, double price, String content) {
        this.courseID = courseID;
        this.title = title;
        this.price = price;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Course " + courseID + " : " + title;
    }
}
