package ie.pt;

public class Employee extends Person {

    // add in new members
    private String employeeId;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String employeeId) {
        super(firstName, lastName);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // replace (override) functionality that I need to
    // change or augment
    @Override
    public void display() {
        System.out.println("Employee:");
        //System.out.println(getFirstName() + " " + getLastName());
        super.display();
        System.out.println("ID:" + employeeId);
    }
}
