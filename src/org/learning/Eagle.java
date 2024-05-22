package org.learning;

public class Eagle extends Animal implements Flying{


    public Eagle(String name){
        setName(name);
    }

    @Override
    public void call() {
        System.out.println("Screech");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando");
    }
}
