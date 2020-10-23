public class composition {
    //composition, 
    //a class can also have references to objects from other
    //classes
    private String name;
    private potpie birthday; //acc to tut this is a reference to another class

    public composition(String theName, potpie theBirthday) {
        this.name = theName;
        this.birthday = theBirthday;
    }

    public String toString() {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
    //%s doesn't necessarily need to take a string, it can maybe take an object
}