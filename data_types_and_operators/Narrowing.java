public class Narrowing {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i; // Сужающее преобразование

        System.out.println(b); // -128
    }
}
