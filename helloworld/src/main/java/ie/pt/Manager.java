package ie.pt;

public class Manager extends Employee {

    private int headCount;

    public Manager(String firstName, String lastName, String employeeId, int headCount) {
        super(firstName, lastName, employeeId);
        this.headCount = headCount;
    }

    @Override
    public void display() {
        System.out.println("Manager:");
        super.display();
        System.out.println("Headcount:" + headCount);
    }
}
