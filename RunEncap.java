public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("Margie");
        encap.setAge(22);
        encap.setIdNum("357765");

        System.out.println("Name: " + encap.getName() + "Age: " + encap.getAge());
    }
}