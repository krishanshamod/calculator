package com.kelaniya.uni;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Krishan Shamod\\Documents\\Coding\\GitHub\\calculator\\src\\java\\com.kelaniya.uni\\numbers.txt");
        Scanner fileScan = new Scanner(file);
        int a = fileScan.nextInt();
        int b = fileScan.nextInt();

        Calculator cal = new Calculator(a,b);

        Scanner scan = new Scanner(System.in);
        String mode = scan.next();

        switch(mode){
            case "add":
                cal.add();
                break;
            case "sub":
                cal.sub();
                break;
            case "mul":
                cal.mul();
                break;
            case "div":
                cal.div();
                break;
        }

        scan.close();
        fileScan.close();
    }
}
