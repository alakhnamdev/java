public class Constructor{
    String name;
    int age;
    
    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello "+name+", Your age is ");
    }
    
    public static void main(String[] args) {
        Constructor ct = new Constructor("Alakh Namdev", 21);
        int x=5, y=10;
        if(x>y){
            if(x>y){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
    }
}