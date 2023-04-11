package javaBrains;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class Ex4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
//        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e));
        ReactiveSources.intNumberMono().subscribe(
                e -> System.out.println(e),
                err -> System.out.println(err.getMessage()),
                ()-> System.out.println("Complete"));
        // Get the value from the Mono into an integer variable
        Integer number = ReactiveSources.intNumberMono().block();
        Optional<Integer> optionalInteger = ReactiveSources.intNumberMono().blockOptional();

        System.out.println("Press a key to end");
        System.in.read();
    }

}