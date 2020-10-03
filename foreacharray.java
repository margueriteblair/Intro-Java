public class foreacharray {
    public static void main(String[] args) {
        double[] myArray = {1.9, 2.9, 3.4, 3.5};
        for (double element: myArray) {
            System.out.println(element);
        }
        //this methdo allows you to travest the array without using an index variable
    }
}
//you can pass arrays to methods as well
//data types are divided into two groups:
//primitive data types include: byte, short, int, long, float, double, boolean, char
//non primitive data types: String, Arrays, Classes
//a primitive data type specifies the size and type of variable values
//and it has no additional methods.

//non-primitive data types are also called reference types because they refer back to objects
//non primitive types are created by the programmer and is not defined by Java
