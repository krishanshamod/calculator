package com.kelaniya.uni;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b){
        System.out.printf("Enter the mode: %n  add - Addition %n  sub - Subtract %n  mul - Multiply %n  div - Divide %n");
        this.a = a;
        this.b = b;
    }

    public void add(){
        System.out.println(a + b);
    }

    public void sub(){
        System.out.println(a - b);
    }

    public void mul(){
        System.out.println(a * b);
    }

    public void div(){
        System.out.println((double) a / b);
    }


}
