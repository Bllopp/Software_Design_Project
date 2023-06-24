import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class TrainingRegistrationManager extends Person implements Employee, Observer {
    private int employeeID;
    private String curriculum;
    private String surname;
    private String firstname;
    private String email;
    private int salary;
    private ArrayList<Session> sessionManaged = new ArrayList<>();

    public TrainingRegistrationManager(int employeeID, String curriculum, String surname, String firstname, String email, int salary){
        this.employeeID = employeeID;
        this.curriculum = curriculum;
        this.surname = surname;
        this.firstname = firstname;
        this.email = email;
        this.salary = salary;
    }

    @Override
    public void contact() {
        System.out.println("You've contacted the Trainig Registration Manager");
    }

    @Override
    public void present() {
        System.out.println("My name is "+ firstname + " "+ surname +" and I earn" + salary+"$.");
    }

    @Override
    public void update(Observable observable, Object o) {
        if ((Integer) o >= 4){
            for (Session s : sessionManaged)
            {
                Session session = (Session) observable;
                if (s.getSessionID() == session.getSessionID())
                {
                    lauchSession((Session)observable);
                }
            }
        }
    }

    public void lauchSession(Session session){
        System.out.println("The session number " + session.getSessionID()+ " is launching");
    }
}
