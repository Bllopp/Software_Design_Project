public class CatalogManager extends Person implements Employee {
    private int employeeID;
    private String curriculum;
    private String surname;
    private String firstname;
    private String email;
    private int salary;

    public CatalogManager(int employeeID, String curriculum, String surname, String firstname, String email, int salary)
    {
        super(surname, firstname, email);
        this.employeeID = employeeID;
        this.curriculum = curriculum;
        this.salary = salary;
    }

    @Override
    public void contact() {
        System.out.println("You've contacted the CCatalog Manager");
    }

    @Override
    public void present() {
        System.out.println("My name is "+ firstname + " "+ surname +" and I earn" + salary+"$.");
    }
}
