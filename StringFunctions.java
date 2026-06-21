public class StringFunctions {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string : ");
        // char str = sc.next().charAt(0);

        String str = "This is a string";
        // Length Method 
        System.out.println("Total Number of characters in String = "+str.length());
        // Uppercase 
        System.out.println(str.toUpperCase());
        // Lowercase 
        System.out.println(str.toLowerCase());
        // CharAt
        System.out.println(str.charAt(5));
        // IndexOF
        System.out.println(str.indexOf("s"));

        // System.out.println("Your input = "+str);
    }
}
