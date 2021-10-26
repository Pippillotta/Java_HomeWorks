/**
* Java1 HomeWork2
 * @author Лукьянова Елизавета
 * @version 26.10.2021
 */

    public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(isPositiveOrNegative(5, 6));
    }

    static boolean isPositiveOrNegative(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}
