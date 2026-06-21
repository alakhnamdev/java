public class ClassesInJava {
    int age;
    String name;

    public ClassesInJava() {
        System.out.println("Constructor called!");
    }

    public ClassesInJava(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        ClassesInJava cj = new ClassesInJava();
        ClassesInJava cj2 = new ClassesInJava(22, "abc");

        cj.name = "Alakh";
        cj.age = 21;
        System.out.println(cj.age);
        System.out.println(cj.name);

        // cj2.name = "abc";
        // cj2.age = 22;
        System.out.println(cj2.age);
        System.out.println(cj2.name);
    }
}
