import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;

public class Session extends Observable {
    private int sessionID;
    private Location location;
    private Date date;
    private boolean isExtra;
    private String link;
    private ArrayList<Client> signedClient = new ArrayList<>();

    public int getSessionID() {
        return sessionID;
    }

    public Location getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public String getLink() {
        return link;
    }

    public ArrayList<Client> getSignedClient(){
        return signedClient;
    }

    public Session(int sessionID, Location location, Date date, boolean isExtra, String link) {
        this.sessionID = sessionID;
        this.location = location;
        this.date = date;
        this.isExtra = isExtra;
        this.link = link;
    }

    public void addClient(Client client){
        signedClient.add(client);
        client.setObservable((Observable) this);

        setChanged();
        notifyObservers(client);


    }
    public void removeClient(Client client){
        signedClient.remove(client);
        setChanged();
        notifyObservers(signedClient.size());

    }
}
