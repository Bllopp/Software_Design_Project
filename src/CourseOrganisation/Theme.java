package CourseOrganisation;

import java.util.ArrayList;

public class Theme {
    private int id;
    private String name;
    private ArrayList<Topic> topics = new ArrayList<Topic>();

    public Theme(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Theme addTopic(Topic topic)
    {
        topics.add(topic);
        return this;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }
}
