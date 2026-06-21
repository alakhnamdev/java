class Student{
    String name;
    int age;

    Student() {
        System.out.println("Student object created!");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Alakh";
        st1.age = 21;

        Student st2 = new Student();
        st2.name = "abc";
        st2.age = 22;

        System.out.println(st1.name+st1.age);
        System.out.println(st2.name+st2.age);

        Student st3 = new Student(23);
        st3.name = "xyz";
        System.out.println(st3.name+st3.age);

        Student st4 = new Student("def");
        st4.age = 24;
        System.out.println(st4.name+st4.age);

        Student st5 = new Student("def",45);
        System.out.println(st5.name+st5.age);
    }
}
