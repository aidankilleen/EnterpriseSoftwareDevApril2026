package ie.pt;

public class Contractor extends Person {

    private String agency;

    public Contractor(String firstName, String lastName, String agency) {
        super(firstName, lastName);
        this.agency = agency;
    }

    @Override
    public void display() {
        System.out.println("Contractor:");
        super.display();
        System.out.println("Agency:" + agency);
    }
}
