package org.isen.fizzbuzz;

import java.util.Iterator;

public class GenericFizzBuzz2 {

    public static void main(String[] args) throws Exception {

        FizzBuzzFactory fb = new FizzBuzzFactory();

        Iterator<String> fizzBuzzIterator = new MappableRange(199)
                .map(fb.getTransformer());
        while(fizzBuzzIterator.hasNext()) {
            System.out.println(fizzBuzzIterator.next());
        }
    }

}
