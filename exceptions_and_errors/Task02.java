public class Task02 {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            // ArithmeticException caught
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            int element = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            // ArrayIndexOutOfBoundsException caught
        }

        // IllegalArgumentException
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
            // IllegalArgumentException caught
        } catch (InterruptedException e) {
            // Обработка исключения InterruptedException, если нужно
        }

        // ClassCastException
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
            // ClassCastException caught
        }

        // NullPointerException
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            // NullPointerException caught
        }
    }
}