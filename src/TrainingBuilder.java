import CourseOrganisation.Catalog;
import CourseOrganisation.Course;
import CourseOrganisation.Theme;
import CourseOrganisation.Topic;

import java.util.ArrayList;

public class TrainingBuilder {
    private String title;
    private double price;
    private Prerequisites test;
    private ArrayList<Course> courseList= new ArrayList<>();
    private ArrayList<Session> scheduledSession = new ArrayList<Session>();

    public Prerequisites getTest() {
        return test;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public ArrayList<Session> getScheduledSession() {
        return scheduledSession;
    }

    public double getPrice() {
        return price;
    }

    public TrainingBuilder addSession(Session session){
        this.scheduledSession.add(session);
        return this ;
    }

    public TrainingBuilder addCourse(int courseID){
        Catalog catalog = Catalog.getInstance();
        for (Theme theme : catalog.getThemes()
             ) {
            for (Topic topic: theme.getTopics()
                 ) {
                for (Course course : topic.getCourseList()
                     ) {
                    if (course.getCourseID() == courseID) {
                        courseList.add(course);
                        addPrice(course);
                        return this;
                    }
                }
            }
        }
        return this;
    }
    public TrainingBuilder addCourse(Course course) {
        courseList.add(course);
        addPrice(course);
        return this;
    }

    public TrainingBuilder takeTest(){
        this.test = new Prerequisites();
        return this ;
    }

    public Training validate(){
        return new Training(this);
    }

    public void addPrice(Course course){
        price += course.getPrice();
    }
}

