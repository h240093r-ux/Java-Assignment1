package number_filter;

import java.util.*;
import java.util.stream.*;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create the ArrayList with given numbers
        List<Integer> numbers = Arrays.asList(1, 4, 5, 20, 30, 6);

        System.out.println("Numbers divisible by 5:");

        // Use Stream to filter and print
        numbers.stream()
               .filter(n -> n % 5 == 0)
               .forEach(System.out::println);
    }
}
