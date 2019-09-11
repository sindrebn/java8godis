package com.github.sindrebn._2_function;

import no.digipost.time.ControllableClock;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class _2_RealWorldExamples {

    public static void main(String[] args) {

        Person standard_boring_way = Person.builder().build();
        System.out.println(standard_boring_way);

        Person older_sindre_boring_way = Person.builder().withAge(46).build();
        System.out.println(older_sindre_boring_way);

        Person older_sindre = get_person(person -> person.withAge(46));
        System.out.println(older_sindre);

        Person john = get_person(person -> person.withName("John").withAge(32));
        System.out.println(john);

        System.out.println();


        new TestComposer()
                .do_something()

                .with_time(clock -> clock.timePasses(Duration.ofDays(3)))

                .do_something();


    }

    private static Person get_person(UnaryOperator<Person.Builder> customizer) {
        return customizer.apply(Person.builder()).build();
    }















    static class TestComposer {

        private final ControllableClock clock = ControllableClock.freezedAt(Instant.now());

        TestComposer do_something() {
            System.out.println("Clock is " + clock.instant());
            return this;
        }

        TestComposer with_time(Consumer<ControllableClock> customizer) {
            customizer.accept(clock);
            return this;
        }

    }
}
