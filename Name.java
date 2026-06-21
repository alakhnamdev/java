class UserDetails {
    String name;

    void inputName(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Hello, " + name);
    }
}

public class Name {

    public static void main(String[] args) {
        UserDetails nm = new UserDetails();
        nm.inputName("Alakh");
        nm.printName();
    }

}
