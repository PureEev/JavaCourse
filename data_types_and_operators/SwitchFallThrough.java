public class SwitchFallThrough {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;

        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                // Нет break, выполнение перейдет к следующему case
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }

        System.out.println("i = " + i); // Output: i = 3
    }
}
