package javaBrains;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;
import java.util.Optional;

public class Ex5 {

    public static void main(String[] args) throws IOException {

            // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

            // Subscribe to a flux using the error and completion hooks
//            ReactiveSources.intNumbersFlux().subscribe(
//                    e -> System.out.println(e),
//                    err -> System.out.println(err.getMessage()),
//                    () -> System.out.println("End")
//            );

            // Subscribe to a flux using an implementation of BaseSubscriber

        ReactiveSources.intNumbersFlux().subscribe(new CustomBaseSubscriber<>());

            System.out.println("Press a key to end");
            System.in.read();

    }
}

class CustomBaseSubscriber<T> extends BaseSubscriber<T> {
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subcribed!");
        request(1);
    }

    public void hookOnNext(T value) {
        System.out.println("Processing :" + value.toString());
        request(1);
    }
}
