public class HomeWork2 {
    public static void main (String[] args) {
        System.out.println(isNegativeOrPositive(10));
        System.out.println(isNegativeOrPositive(0));
    }
    static boolean isNegativeOrPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }
}
