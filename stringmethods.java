public class stringmethods {
    public static void main(String[] args) {
        String x = "chicken pot pie";
        System.out.println(x.charAt(x.length()-1));

        String fullAd = x.concat(" Now with more sodium!");
        System.out.println(fullAd);
        System.out.println(fullAd.contains("chicken")); //returns a boolean
        System.out.println(fullAd.indexOf("pot"));
        System.out.println(fullAd.toUpperCase());
        System.out.println(fullAd.substring(9, 20));
        System.out.println(fullAd.repeat(3));
    }
}