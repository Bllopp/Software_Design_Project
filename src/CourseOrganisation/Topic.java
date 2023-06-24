package CourseOrganisation;

import java.util.ArrayList;

public class Topic {
    private String name;
    private int id;
    private ArrayList<SubTopic> subTopics = new ArrayList<SubTopic>();
    private ArrayList<Course> courseList = new ArrayList<>();

    public Topic(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Topic addSubTopic(SubTopic st){
        subTopics.add(st);
        return this;
    }

    public Topic addCourse(Course course){
        courseList.add(course);
        return this;
    }

    public ArrayList<SubTopic> getSubTopics() {
        return subTopics;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
}
