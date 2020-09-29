public class stringclass {
    public static void main(String[] args) {

        String x = "hello";
        //or
        String y = new String("hello world\n\n\ntehe");
        System.out.println(x.charAt(0));
        //java is very strict!
        System.out.println(y);
        String name = "Margie";
        System.out.println((String.format("hello %s", name)));

        name.length(); //returns the length of characters

        
        
    }
}