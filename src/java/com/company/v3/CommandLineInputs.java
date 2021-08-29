package com.company.v3;

public class CommandLineInputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() {

        //Make sure the argument is correct
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return ""; //Will change in the future
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide add,sub or mul as the argument");
            return ""; //Will change in the future
        }

        return operator;
    }
}
