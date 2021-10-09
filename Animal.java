package com.company;

public abstract class Animal {
    private int run_distance;
    private int swim_distance;

    public Animal(int run_distance, int swim_distance) {
        this.run_distance = run_distance;
        this.swim_distance = swim_distance;
    }


    public void run() {
        System.out.println("пробежала " + run_distance);
    }
    public void swim() {
        System.out.println("проплыла " + swim_distance);
    }
}
