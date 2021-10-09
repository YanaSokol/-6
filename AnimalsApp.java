package com.company;

public class AnimalsApp {

    public static void main(String[] args) {
        Animal cat = new Cat(200, 2);
        Animal dog = new Dog(500, 3);
        cat.run(300);
        cat.swim(1);
        dog.run(500);
        dog.swim(3);
    }
}
