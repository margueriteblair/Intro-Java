import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 88;
        //lets say we wanted to store a, b, c all in one place
        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        //we have to declare hashmaps with the types they'll be using
        //use reference type variables to declare it
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobbyjoe", "helloworld11");
        fun.put("helloworld11", "imsad99");
        fun.put("margieblair33", "432lsllxa");

        fun.remove("bobbyjoe");
        fun.containsValue("helloworld11");
        fun.size(); //returns how many entries
        fun.replace("key", "value");

        System.out.println(fun);
    }
}