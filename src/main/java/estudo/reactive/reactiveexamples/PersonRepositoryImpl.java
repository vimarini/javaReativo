package estudo.reactive.reactiveexamples;

import estudo.reactive.reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person michael = new Person(1, "Michael", "Jackson");
    Person fiona = new Person(2, "Fiona", "Castro");
    Person shrek = new Person(3, "Shrek", "Silva");
    Person carlos = new Person(4, "Carlos", "Eduardo");

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(michael, fiona, shrek, carlos);
    }
}
