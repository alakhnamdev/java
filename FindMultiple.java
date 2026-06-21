public class FindMultiple {
    public static void main(String[] args){
        int count = 0;
        // for (int i = 1; i < 50; i++) {
        //     if(i%3==0){
        //         count++;
        //     }
        // }

        int multiple = 0;
        
        while(true){
            multiple = multiple+3;
            System.out.println(multiple);
            count++;
            if(multiple>50){
                break;
            }
        }
        System.out.println(count);
    }
}