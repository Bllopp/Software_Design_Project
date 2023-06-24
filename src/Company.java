import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<Person> Employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getEmployees() {
        return Employees;
    }
}
