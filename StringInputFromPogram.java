public class StringInputFromPogram {
    public static void main(String[] args) {
        String str = "Hello";
        for (String arg : args) {
            str += " "+arg;
        }
        System.out.println(str+"\nNice to meet you!");
    }
}
