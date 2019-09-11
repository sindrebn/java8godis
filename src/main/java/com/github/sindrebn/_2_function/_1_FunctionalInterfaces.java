package com.github.sindrebn._2_function;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.*;
import java.util.stream.Stream;

public class _1_FunctionalInterfaces {

    public static void main(String[] args) throws IOException {
        Stream.of("Oslo", "Norway", "World")
                .map(location -> "Hello " + location + "!")
                .forEach(System.out::println);

        System.out.println();

        Function<String, String> greeter = location -> "Hello " + location + "!";

        Stream.of("Oslo", "Norway", "World")
                .map(greeter)
                .forEach(System.out::println);
//
        System.out.println();
        System.out.println();

        Stream.of("Oslo", "Norway", "World")
                .filter(location -> location.length() > 4)
                .forEach(System.out::println);

        System.out.println();

        Predicate<String> longLocation = location -> location.length() > 4;
        Stream.of("Oslo", "Norway", "World")
                .filter(longLocation)
                .forEach(System.out::println);

        System.out.println();
//
//
//        assertEquals("a", "b", () -> "Message explaining what's wrong. Very heavy to compute, so we must do it lazily!");
//
//        Supplier<String> mismatchMessageComputation = () -> "Message explaining what's wrong. Very heavy to compute, so we must do it lazily!";
//        assertEquals("a", "b", mismatchMessageComputation);
//
//
//        // Many specializations:
//
//
//        // Special version of Function where IN and OUT types are the same
        UnaryOperator<String> doSomeStuff = b -> b.trim().toLowerCase() + "!";
        System.out.println("HellO => " + doSomeStuff.apply("HellO"));

        System.out.println();

        // BiPredicate => 2-arity specialization of Predicate. Accepts two arguments
        BiPredicate<Path, BasicFileAttributes> directoriesStartingWithA = (path, basicFileAttributes) -> path.startsWith("a") && basicFileAttributes.isDirectory();
        Files.find(Paths.get("/Users/sindrenordbo/Downloads"), 1, directoriesStartingWithA);

//      int => double specialization of Function. Removes need of boxing
        IntToDoubleFunction divideByTwo = i -> i / 2;
        double halfOfFour = divideByTwo.applyAsDouble(4);
        System.out.println("Half of 4 is: " + halfOfFour);
//
//        System.out.println();
//
//
        // T, U => int specialization of Function
        ToIntBiFunction<Double, Double> sumDoubles = (x, y) -> x.intValue() + y.intValue();
        int summed = sumDoubles.applyAsInt(Double.valueOf("1.5"), Double.valueOf("3.9"));
        System.out.println("1.5 + 3.9 is: " + summed);
    }
}
