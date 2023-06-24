public class Location {
    private int number;
    private String streetName;
    private String city;
    private int roomNb;
    private boolean availability;

    public int getNumber() {
        return number;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public int getRoomNb() {
        return roomNb;
    }

    public boolean isAvailability() {
        return availability;
    }

    public Location(int number, String streetName, String city, int roomNb, boolean availability) {
        this.number = number;
        this.streetName = streetName;
        this.city = city;
        this.roomNb = roomNb;
        this.availability = availability;
    }
}
