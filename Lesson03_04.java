/**
* Java1 HomeWork3
* @author Лукьянова Елизавета
* @version 16.10.2021
*/

import java.util.Arrays;

public class Lesson03_04 {
    public static void main (String args []) {
        int [] [] matrix = new int [4] [4];
        for (int i = 0; i < matrix.length; i++) {
            matrix [i] [i] = 1;
            matrix [i] [matrix.length - i - 1] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
