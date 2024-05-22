package org.learning;

public class Dog extends Animal{

    public Dog(String name){
        setName(name);
    }

    @Override
    public void call() {
        System.out.println("Woof woof");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }
}
