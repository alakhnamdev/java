public class Stack {
    static int counter = -1;
    static int size = 5;
    static int arr[] = new int[size];

    static void push(int element){
        if(counter<4){
            counter++; // counter + 1 = 0
            arr[counter] = element;
            System.out.println("Element inserted.");
        }
        else{
            System.out.println("Overflow");
        }
    }

    static void display(){
        System.out.println("------");
        for(int i = 0; i<counter+1; i++){
            System.out.println("| "+arr[i]+" |");
        }
        System.out.println("------");
    }

    static void pop(){
        if(counter > -1){
            counter--;
            System.out.println("Element deleted.");
        }
        else{
            System.out.println("Underflow");
        }
    }

    public static void main(String[] args) {
        push(10); // counter = 0
        push(20); // counter = 1
        push(30); // counter = 2
        push(40);
        push(50);
        display();

        pop();
        push(60);
        display();
    }
}
