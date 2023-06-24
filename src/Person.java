public class Person {
    private String surname;
    private String firstname;
    private String email;

    public Person(String surname, String firstname, String email){
        this.email = email;
        this.surname = surname;
        this.firstname = firstname;
    }

    public Person(){};

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }
}
