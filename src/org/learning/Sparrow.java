package org.learning;

public class Sparrow extends Animal implements Flying{

    public Sparrow(String name){
    setName(name);
    }

    @Override
    public void call() {
        System.out.println("Cip cip");
    }

    @Override
    public void eat() {
        System.out.println("Everything");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando");
    }
}
