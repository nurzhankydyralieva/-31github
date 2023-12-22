package org.codingBat;

public class SumDouble {
    public static void main(String[] args) {
        System.out.println( sumDouble(4, 2));
    }

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if( !weekday || vacation){
            return true;
        }
        return false;
    }
}
