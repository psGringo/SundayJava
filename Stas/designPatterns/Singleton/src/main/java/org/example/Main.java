package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class SomeSingleTone {
    private SomeSingleTone instance;

    private SomeSingleTone() {
    }

    public SomeSingleTone getInstance() {
        if (instance != null)
            return instance;

        return new SomeSingleTone();
    }

}