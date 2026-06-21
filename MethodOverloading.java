public class MethodOverloading {
    int add(int a, int b) {
        System.out.println("Function 1 Used");
        return a + b;
    }

    double add(int a, double b) {
        System.out.println("Function 2 Used");
        return a + b;
    }

    double add(double a, int b) {
        System.out.println("Function 3 Used");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("Function 4 Used");
        return a + b;
    }

    int add(int a, int b, int c) {
        System.out.println("Function 5 Used");
        return a + b + c;
    }

    static void greet() {
        System.out.println("Welcome User!");
    }

    static void greet(String name) {
        System.out.println("Welcome " + name + " !");
    }

    public static void main(String[] args) {
        MethodOverloading md = new MethodOverloading();
        System.out.println(md.add(45, 45));
        System.out.println(md.add(45, 45.5));
        System.out.println(md.add(45.5, 45));
        System.out.println(md.add(45.6, 45.6));
        System.out.println(md.add(45, 45, 45));
        greet();
        greet("Alakh");
    }

}
