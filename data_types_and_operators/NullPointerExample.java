public class NullPointerExample {
    public static void main(String[] args) {
        Integer num = null; // Объект равен null

        try {
            int value = num; // Автораспаковка вызывает NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
