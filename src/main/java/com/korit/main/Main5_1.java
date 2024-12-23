package com.korit.main;

@FunctionalInterface
interface Animal {
    public void eat();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat banana");
    }
}

public class Main5_1 {

    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.eat();

        Animal animal2 = new Animal() {
            @Override
            public void eat() {
                System.out.println("Dog2 apple");
            }
        };

        animal2.eat();

        Animal animal3 = () -> {
            System.out.println("Dog eat mango");
        };

        animal3.eat();
    }
}
