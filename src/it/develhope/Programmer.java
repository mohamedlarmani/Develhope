package it.develhope;

public class Programmer {

    public String name;
    public int age;
    public boolean wearsGlasses;

    public Programmer (String name, int age, boolean wearsGlasses){
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }

    public void drinkCoffee(){
        System.out.println("Espresso is the secret!");
    }

    public void printDetails(){
        System.out.println(name +" is a " + age + " programmer");
    }

    public void wearsGlasses(){
        System.out.println("Is  " + name + " wearing glasses? " + wearsGlasses);
    }
}
