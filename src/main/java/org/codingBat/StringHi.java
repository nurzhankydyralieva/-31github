package org.codingBat;

import java.util.Scanner;

public class StringHi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        startHi(s);
    }

    private static boolean startHi(String str) {
        if (str.length() < 2) return false;

        String first = str.substring(0, 2);
        if (first.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }
}
