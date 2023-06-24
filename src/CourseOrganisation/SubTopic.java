package CourseOrganisation;

import java.util.ArrayList;

public class SubTopic {
    private String name;
    private int id;
    private ArrayList<Course> courseList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
}
