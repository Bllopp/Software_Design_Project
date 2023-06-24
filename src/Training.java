import CourseOrganisation.Course;

import java.util.ArrayList;

public class Training {

    private String title;
    private double price;
    private Prerequisites test;
    private ArrayList<Course> courseList= new ArrayList<>();
    private ArrayList<Session> scheduledSession = new ArrayList<Session>();

    public Training(TrainingBuilder builder){
        this.price = builder.getPrice();
        this.courseList = builder.getCourseList();
        this.scheduledSession = builder.getScheduledSession();
        this.title = builder.getTitle();
        this.test = builder.getTest();

    }


    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Prerequisites getTest() {
        return test;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public ArrayList<Session> getScheduledSession() {
        return scheduledSession;
    }
}
