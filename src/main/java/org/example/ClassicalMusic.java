package org.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doInit() {
        System.out.println("Doing initialization");
    }

    public void doDestroy() {
        System.out.println("Doing destroy");
    }

    @Override
    public String getSong() {
        return "Perfect Symphony";
    }

}
