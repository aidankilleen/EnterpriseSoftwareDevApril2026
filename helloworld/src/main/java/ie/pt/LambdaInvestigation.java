package ie.pt;

import java.util.List;
import java.util.stream.Stream;

public class LambdaInvestigation {


    public static boolean isEven(Integer i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println("Lambda Investigation");

        // lambda is a type of function
        // lambdas are declared inline rather than separately
        // lambdas are "anonymous"

        // there are some functions that take functions as parameters
        // there are lots of these in the Steam class.
        // forEach takes a function that returns void
        // filter takes a function that returns boolean
        List<Integer> numbers = List.of(1, 4, 3, 2, 9, 10, 7, 6, 11);
        numbers.stream().forEach(System.out::println);
        Stream<Integer> result = numbers.stream().filter(LambdaInvestigation::isEven);
        System.out.println(result);
        result.forEach(System.out::println);

        System.out.println("------------------------------------");
        // a lambda allows us to declare the function as we're using it
        // instead of declaring it before

        result = numbers.stream().filter((i) -> {
            if (i %2 == 0) {
                return true;
            } else {
                return false;
            }
        });
        result.forEach((i) -> {
            System.out.println(i);
        });


        System.out.println("-------------------------------");
        // you can chain these calls together:
        numbers.stream().filter((i) -> {
            if (i %2 == 0) {
                return true;
            } else {
                return false;
            }
        }).forEach((i) -> {
            System.out.println(i);
        });

        // you can abbreviate this code as follows
        // if there is a single parameter you can remove ()
        // if you lambda is just a single line you can remove {}, return, ;
        numbers.stream().forEach(i -> System.out.println(i));

        numbers.stream().filter(i -> i % 2 == 0)
                        .forEach(i -> System.out.println(i));

        // we can use the steams api to sort a list

        numbers = List.of(10, 6, 8, 5, 3, 9, 2, 7, 11, 3, 1);

        numbers.stream().sorted((a, b) -> {
            System.out.println("Comparing " + a + " to " + b);
            if (a > b) {
                return 1;
            } else if (a == b) {
                return 0;
            } else {
                return -1;
            }
        }).forEach(System.out::println);

        System.out.println("------------------------------------------");
        // we can shorten this code
        numbers.stream().sorted((a, b) -> b - a)
                        .forEach(System.out::println);
    }
}
