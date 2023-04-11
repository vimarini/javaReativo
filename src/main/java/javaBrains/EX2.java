package javaBrains;

import java.io.IOException;

public class EX2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(e));
        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux().subscribe(e -> System.out.println(e.getFirstName()));

        System.out.println("Press a key to end");
        System.in.read();
    }
}
