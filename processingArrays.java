public class processingArrays {
    public static void main(String[] args) {
        //when processing array elements we can either use a for loop
        //or a foreach loop because all elements in the array are of the same type and the size is known
        double[] myList = {1.9, 2.9, 3.9, 4.9};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total in array is: " + total);
    
    }

}