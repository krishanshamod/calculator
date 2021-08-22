package com.company.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    //SOLID PRINCIPLES --> ALL THE SOLID PRINCIPLES ARE VIOLATED HERE!!!
    public static void main(String[] args) throws IOException {

        //Make sure the argument is correct
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return;
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide add,sub or mul as the argument");
            return;
        }

        //read the numbers from txt file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("C:\\Users\\Krishan Shamod\\Documents\\Coding\\GitHub\\calculator\\numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        double result = 0;

        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else if (operator.equals("mul")) {
            result = number1 * number2;
        }

        System.out.println("The result is " + result);

    }
}