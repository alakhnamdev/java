public class TypeCasting {
    public static void main(String[] args) {
        int num = 45;
        System.out.println(num);
        double num2 = (int) num;
        System.out.println(num2);

        double x = 45.26d;
        float y = 35.7f;
        System.out.println(x + "," + y);

        int x1 = (int) x;
        int y1 = (int) y;
        System.out.println(x1 + "," + y1);

        String num3 = String.valueOf(num);
        System.out.println(num3);

        String z = "100";
        int num4 = Integer.parseInt(z);
        System.out.println(num4+45);
    }
}
