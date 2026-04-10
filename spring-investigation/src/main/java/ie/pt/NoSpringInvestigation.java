package ie.pt;

public class NoSpringInvestigation {

    public static void main(String[] args) {

        System.out.println("No Spring");

        UserDao dao = new UserDao();
        UserService us = new UserService(dao);

        for (User user : us.getUsers()) {
            System.out.println(user);
        }
    }
}
