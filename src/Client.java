import java.awt.desktop.SystemEventListener;
import java.util.Observable;
import java.util.Observer;

public class Client extends Person implements Observer {
    private String surname;
    private String firstname;
    private String email;
    private int clientID;
    private String companyName;
    private Observable observable;

    public Client(String surname, String firstname, String email,int clientID, String companyName)
    {
        super(surname, firstname, email);
        this.clientID = clientID;
        this.companyName = companyName;
    }

    public int getClientID() {
        return clientID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setObservable(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        Session session = (Session) observable;
        Client c = (Client) o;
        if (c.getClientID() == this.clientID) {
            System.out.println("The client " + clientID + " has signed to the session " + session.getSessionID());
        }


    }

}
