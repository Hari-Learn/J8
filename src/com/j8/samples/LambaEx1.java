package com.j8.samples;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambaEx1 {
    public static void main(String[] args) {
//        Runnable r = () -> System.out.println("Without curly braces");
//        r.run();
        Consumer<Integer> r = (x) -> System.out.println("Square root of "+x +" - "+x*x);
        r.accept(10);
        Function<Integer,Integer> x = (a) -> {return a*a;};
        System.out.println("Gotcha :"+x.apply(10));
    }
}
