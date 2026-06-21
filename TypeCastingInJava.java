public class TypeCastingInJava {
    public static void main(String[] args) {
        int x = 5, y = 2;
        double q = x/y;
        System.out.println(q);
        double q2 = (double) x/y;
        System.out.println(q2);
    }
}
