abstract class Animal{
    public void eat(){
        System.out.println("eating");
    }
    public void walk(){
        System.out.println("walking");
    }
    public void breed(){
        System.out.println("breed");
    }
    abstract void sound();
}

class Dog extends Animal{
    public void eat(){
        System.out.println("I'm carnivore");
    }
    @Override
    void sound(){
        System.out.println("barking");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.eat();
        dg.walk();
        // Animal an = new Animal();
    }
}
