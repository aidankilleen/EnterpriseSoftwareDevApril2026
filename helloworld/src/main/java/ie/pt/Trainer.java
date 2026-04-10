package ie.pt;

public class Trainer extends Employee implements Teacher {
    public Trainer(String firstName, String lastName, String employeeId) {
        super(firstName, lastName, employeeId);
    }

    @Override
    public void teach() {
        System.out.println("Class is starting...");
    }
}
