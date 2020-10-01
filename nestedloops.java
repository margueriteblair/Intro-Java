public class nestedloops {
    public static void main(String[] args) {
        int i = 9;
        while(i >= 0) {
            int j = i;
            while(j >= 0) {
                System.out.println(j + " ");
                j--;
            }
            i--;
        }
    }}
//         for (int i = 9; i >= 0; i--) {
//             for (int j = i; j >= 0; j--) {
//                 System.out.println(j + " ");
//             }
//             System.out.println(); //ten iterations of ten iterations!
//         }
//     }

