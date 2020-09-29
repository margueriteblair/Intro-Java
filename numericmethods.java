public class numericmethods {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println((Integer.max((10), 20))); //static method
        System.out.println(Integer.compare(y, x));

        String money = "300";

        System.out.println(Integer.valueOf(money));
        System.out.println(Integer.parseInt(money));
        //more common to see parseInt used, but valueOf will also return the numeric value of the string
    }
}