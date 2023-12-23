package org.codingBat;

public class MixStart {
    public static void main(String[] args) {
        System.out.println( mixStart("mix"));
    }

    private static boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String second = str.substring(1, 3);
        if (second.equals("ix")) {
            return true;
        }
        return false;

    }
}
