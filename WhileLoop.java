

public class WhileLoop {
    public static void main(String[] args) {
        // int i = 0;
        // while (i<=10) {
        //     i++;
        //     if (i==5){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // Scanner sc = new Scanner(System.in);
        // while (true) { 
        //     System.out.print("Enter value : ");
        //     int num = sc.nextInt();
        //     if(num==0){
        //         break;
        //     }
        //     else{
        //         System.out.println("Enter 0 to exit this program");
        //     }
        // }

        int i = 0;
        int sum  = 0;
        int count = 0;
        
        while(i<=50){
            count++;
            sum += i;
            i = i+2;
        }

        System.out.println(sum+","+count);


        // for (int i = 0; i < 10; i++) {      
        //     if (i==5){
        //         continue;
        //     }  
        //     System.out.println(i);    
        // }
        // System.out.println("i = "+i);
    }
}
