class Vehicle {
    int speed = 180;

    public Vehicle() {
        System.out.println("Vehicle object created");
    }

    public void viewSpeed() {
        System.out.println("Speed = " + speed);
    }

}

class Car extends Vehicle {
    int speed = 200;

    public Car() {
        System.out.println("Car object created");
        super();
    }

    public void viewSpeed() {
        System.out.println("Speed = " + speed);
    }

    public void printParentSpeed() {
        super.viewSpeed();
    }
}

public class SuperClass {
    public static void main(String[] args) {
        Vehicle vh = new Vehicle();
        vh.viewSpeed();
        Car cr = new Car();
        cr.printParentSpeed();
    }
}
