package org.learning;

public abstract class Animal {

    protected String name;

    public String getName(){
    return name;
    }

    public void setName(String name) throws IllegalArgumentException{
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Devi inserire un nome");
        }
        this.name= name;
    }

    public void sleep(){
        System.out.println("Zzzz");
    }
    public  abstract void call();
    public  abstract void eat();
}
