import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Trainer extends Person implements Employee, Observer {
    private int employeeID;
    private String curriculum;
    private int salary;
    private String qualityWarning;
    private ArrayList<Session> sessionTrained = new ArrayList<>();
    private Observable observable;

    public Trainer(int employeeID, String curriculum, String surname, String firstname, String email, int salary, String qualityWarning)
    {
        super(surname, firstname, email);
        this.employeeID = employeeID;
        this.curriculum = curriculum;
        this.salary = salary;
        this.qualityWarning = qualityWarning;
    }

    public void addSession(Session session){
        setObservable((Observable) session);
        this.observable.addObserver(this);
        sessionTrained.add(session);
    }

    public void addSessions(ArrayList<Session> sessions){
        for (Session s : sessions
             ) {
            setObservable((Observable) s);
            this.observable.addObserver(this);
            sessionTrained.add(s);
        }

    }

    public void setObservable(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void contact() {
        System.out.println("You've contacted the Trainer");
    }

    @Override
    public void present() {
        System.out.println("My name is "+ this.getFirstname() + " "+ this.getSurname() +" and I earn " + salary+"$.");
    }

    @Override
    public void update(Observable observable, Object o) {
        for ( Session s : sessionTrained)
           if (s.getSignedClient().size()>= 4){
               System.out.println("Session is launching");
                Session session = (Session) observable;
                if (s.getSessionID() == session.getSessionID())
                {
                    lauchSession((Session)observable);
                }
            }
        else {
            System.out.println("Not enough client in the Training");
           }
        }

    private void lauchSession(Session observable) {
        System.out.println("The trainer " + employeeID  + " has been informed by email");
        for (Client c : observable.getSignedClient()
             ) {
            System.out.println("The client " + c.getClientID() +" has been informed by email");
        }
    }
}
