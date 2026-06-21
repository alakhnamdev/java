public class StingMethods {
    public static void main(String[] args) {
        // charAt()
        String name = "Alakh";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // concat
        String a = "Alakh";
        String b = "Namdev";
        String c = a + " " + b;
        String d = "Hello ".concat(c);
        System.out.println(c);
        System.out.println(d);

        // compareTo
        String c1 = "Test";
        String c2 = "Test2jkjjk";
        System.out.println(c1.compareTo(c2));

        // equals
        String test = "Test";
        System.out.println(c1.equals(test));

        // endsWith, startWith
        String ends = "This is a string";
        System.out.println(ends.endsWith("g"));
        System.out.println(ends.startsWith("This"));

        // format
        String message = "Hello %s %s";
        System.out.println(String.format(message, "Alakh", "Namdev"));

        // indexOf, lastIndexOf
        System.out.println(ends.indexOf('s'));
        System.out.println(ends.lastIndexOf('s'));

        // isEmpty
        String test2 = "";
        System.out.println(test.isEmpty());
        System.out.println(test2.isEmpty());

        // // replace, replaceAll
        String rep = "Java is Awesome, Java is very popular";
        System.out.println(rep.replace("Awesome", "verbose"));
        System.out.println(rep.replaceAll("Java", "Python"));

        // split
        String arr[] = rep.split(" ");
        for (String i : arr) {
            System.out.println(i);
        }

        // join
        String joinedString = String.join(" ", arr);
        System.out.println(joinedString);

        // toCharArray
        char arr2[] = rep.toCharArray();
        for(char i: arr2){
            System.out.println(i);
        }

        // toString
        String chartoSring = String.valueOf(arr2);
        System.out.println(chartoSring);

        // trim 
        String spacedString = "      Java      is a language         ";
        System.out.println(spacedString.trim());

        //substring
        String subst = rep.substring(0,4);
        System.out.println(subst);
    }
}
