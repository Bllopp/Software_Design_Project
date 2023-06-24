import CourseOrganisation.Catalog;
import CourseOrganisation.Course;
import CourseOrganisation.Theme;
import CourseOrganisation.Topic;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Catalog  catalog = Catalog.getInstance();



        Course java = new Course(1,"java",23,"Cours de java");
        Course html = new Course(2,"html",18,"Cours de HTML");

        catalog.addTheme(new Theme(4,"Developpement Language").addTopic(new Topic(42,"Web Langugage").addCourse(java)));

        Theme theme = new Theme(1, "informatique");
        theme.addTopic(new Topic(1, "programmation"));

        Client client1 = new Client("Doe","Jhon","jhon.doe@mail.com",6,"Google");
        Client client2 = new Client("Potter","Harry","harry@mail.com",7,"Poudlard");
        Client client3 = new Client("Dupont","Pierre","pierre@mail.com",8,"Harvard");
        Client client4 = new Client("Hugo","Victor","victor@mail.com",9,"Notre-Dame");

        Trainer trainer =new Trainer(189,"New employee in the company","Chevalier","Luc","Luc@trainer.com",2400,"Neutral");

        TrainingRegistrationManager TRM = new TrainingRegistrationManager(25432,"Former Employee","Damien","François","DamienF@company.com",2355);

        trainer.present();
        trainer.contact();

        TRM.present();
        TRM.contact();



        Location loc1 = new Location(4,"Rue Victor Hugo","Paris",4,true);
        Date date = new Date();

        TrainingBuilder trainingBuilder = new TrainingBuilder();
        trainingBuilder.addCourse(1);
        trainingBuilder.addCourse(html);
        trainingBuilder.addSession(new Session(5,loc1,date,false,"url/test"));

        trainer.addSessions(trainingBuilder.getScheduledSession());

        for (Session s : trainingBuilder.getScheduledSession()) {
            s.addClient(client1);
            s.addClient(client2);
            s.addClient(client3);
            s.addClient(client4);
        }
        Training training = trainingBuilder.validate();

        System.out.println(training.getCourseList().toString());
    }

}
