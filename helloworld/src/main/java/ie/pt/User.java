package ie.pt;

public class User {

    // member variables / properties
    private int id;
    private String name;
    private String email;
    private boolean active;
    private int age;

    // member functions / methods
    // constructor(s)

    public User() {
        // default constructor
        // takes no parameters
        // in enterprise sw it's usually a good idea
        // to have a default constructor
    }

    public User(int id,
                String name,
                String email,
                boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
    }
    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", age=" + age +
                '}';
    }
}
