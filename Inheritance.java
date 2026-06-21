import com.Test;

class Animal {
    public void eat() {
        System.out.println("I eat food");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Bark");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Test ts = new Test();
        System.out.println(ts.name);
        // Dog dg = new Dog();
        // dg.bark();
        // dg.eat();
    }
}
