package org.codingBat;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(helloName(name));
    }
    public static String helloName(String name) {
        return "Hello " + name +"!";
    }

}
