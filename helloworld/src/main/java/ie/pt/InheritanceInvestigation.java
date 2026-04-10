package ie.pt;

import java.util.ArrayList;
import java.util.List;

public class InheritanceInvestigation {


    public static void main(String[] args) {

        System.out.println("Inheritance Investigation");

        // List<> is an interface
        // there are several classes that implement this interface
        // but we often just have variables declared as List<>

        // you don't need to specify the generic types <Teacher> a second time
        // lozenge operator <>
        List<Teacher> teachers = new ArrayList<>();

        teachers.add(new Trainer("Harriet", "Hudson", "E22111"));
        teachers.add(new Tutor("John", "Jones", "CPL"));

        for (Teacher teacher : teachers) {
            teacher.teach();
        }



        Trainer t = new Trainer("Eve", "Evans", "E21212");
        t.teach();

        Teacher tt = new Trainer("Fred", "Flintstone", "E33333");
        tt.teach();

        Teacher tut = new Tutor("Ger", "Graham", "CPL");
        tut.teach();




        System.out.println("---------------------------");






        Person p = new Person("Alice", "Adams");
        p.display();

        // Polymorphism
        // heterogenous list
        // i.e. the items in the list are not exactly the same
        // but they do have a common super class
        ArrayList<Person> team = new ArrayList<Person>();
        team.add(new Person("Alice", "Adams"));
        team.add(new Employee("Bob", "Burns", "E12345"));
        team.add(new Contractor("Carol", "Conway", "CPL"));
        team.add(new Manager("Danielle", "Dunne", "E22222", 10));

        for (Person teamMember : team) {
            teamMember.display();
        }

        System.out.println("==========================================");







        Employee e = new Employee("Bob", "Burns", "E12345");
        // with inheritance we get access to
        // all of the super class members (variables and functions)
        e.display();

        Contractor c = new Contractor("Carol", "Conway", "CPL");
        c.display();

        Manager m = new Manager("Danielle", "Dunne", "E22222", 10);
        m.display();

        // Employee
        // firstName, lastName, employeeId

        // Contractor
        // firstName, lastName, agency

        // Manager
        // firstName, lastName, employeeId, headCount


        // Solution

        // Person
        // firstName, lastName

        // Employee extends Person
        // employeeId

        // Contractor extends Person
        // agency

        // Manager extends Employee
        // headCount









    }
}
