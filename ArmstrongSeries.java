public class ArmstrongSeries {
    public static void main(String[] args) {
        for (int j = 1; j < 500; j++) {            
            int num = j;
            int org = num;
            int arm = 0;

            // Calculating Length of the number
            String l = String.valueOf(num);     // Typecasting int -> string
            int len = l.length();            

            while (num > 0) {
                int temp = num % 10;
                arm = (int) (arm + (Math.pow(temp, len)));
                num = num / 10;
            }

            if (org == arm) {
                System.out.println(org);
            }
        }
    }
}
