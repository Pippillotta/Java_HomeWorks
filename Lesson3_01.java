import java.util.Arrays;

public class Lesson03_01 {

    public static void main (String[] args) {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
            arr[i] = (arr[i] > 0) ? 0 : 1;
            System.out.println(Arrays.toString(arr));
        }
    }
