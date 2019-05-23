package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        if (number % 7 == 0) return "Junn";
        if (number % 11 == 0) return "Junn";
        if (number % 13 == 0) return "Junn";
        if (number % 15 == 0) return "Junn";
        if (number % 17 == 0) return "Junn";
        if (number % 19 == 0) return "Junn";
        if (number % 21 == 0) return "Junn";

        return String.valueOf(number);
    }
}
