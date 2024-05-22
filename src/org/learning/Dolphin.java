package org.learning;

public class Dolphin extends Animal implements Swimming{

    public Dolphin(String name){
        setName(name);
    }

    @Override
    public void call() {
        System.out.println("Click click");
    }

    @Override
    public void eat() {
        System.out.println("Fish");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando");
    }
}
