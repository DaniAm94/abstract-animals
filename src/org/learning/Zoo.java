package org.learning;

public class Zoo {
    public static void main(String[] args) {

        Animal[] zoo= {new Dog("Spike"), new Sparrow("Jack"), new Eagle("Igor"), new Dolphin("Dingo")};
        for(Animal animal : zoo){
            System.out.println("********\nSono " + animal.getName());
            System.out.println("La mia specie è " + animal.getClass().getSimpleName());
            animal.sleep();
            animal.eat();
            animal.call();
            if (animal instanceof Flying ){
                makeFly((Flying) animal);
            } else if (animal instanceof Swimming){
                makeSwim((Swimming) animal);
            }
        }
    }


    public static void makeFly(Flying flying){
        flying.fly();
    }

    public static void makeSwim(Swimming swimming){
        swimming.swim();
    }
}
