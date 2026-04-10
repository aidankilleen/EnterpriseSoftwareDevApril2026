package ie.pt;


import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String ascii = FigletFont.convertOneLine("Aidan");
        System.out.println(ascii);

        User user2 = new User();



        User user = new User(1,
                "Alan",
                "alan@gmail.com",
                true);

        System.out.println(user.getName());
        user.setAge(21);
        user.setAge(-999999);

        System.out.println(user.getAge());


        // if you use an object but a String is expected
        // java will "implicitly" call the toString() method
        System.out.println(user);

        System.out.println(user.toString());

        // Generic syntax
        // provides type-safety on the ArrayList class
        List<User> users = new ArrayList<User>();

        users.add(new User(1, "Alice", "alice@gmail.com", true));
        users.add(new User(2, "Bob", "bob@gmail.com", false));
        users.add(new User(3, "Carol", "carol@gmail.com", true));
        users.add(new User(4, "Dan", "dan@gmail.com", true));

        // generic syntax provides type-safety for my ArrayList class
        //users.add("not a user object");

        System.out.println("---------------------------------------");
        for (User u : users) {
            System.out.println(u);
        }





    }
}