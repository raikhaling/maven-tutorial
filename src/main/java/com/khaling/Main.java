package com.khaling;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String input = "hello everyneone this a example of maven and its dependencies.";

        /**
         * Apache Commons Lang is a popular Java library that provides a set of utility classes
         * and methods for various common programming tasks.
         */

        String capitalizedInput = StringUtils.capitalize(input);
        System.out.println("-------------Capitalized Using Common Lang-----------------");
        System.out.println(capitalizedInput);




    }
}