class Animal {
    public void eat() {
        System.out.println("I eat food");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.eat();
    }
}
