public class DecodeExample {
    public static void main(String[] args) {
        Integer dec = Integer.decode("42");      // Десятичное число
        Integer hex = Integer.decode("0x2A");   // Шестнадцатеричное число
        Integer oct = Integer.decode("052");    // Восьмеричное число

        System.out.println("Decimal: " + dec); // 42
        System.out.println("Hexadecimal: " + hex); // 42
        System.out.println("Octal: " + oct); // 42

        // Некорректный формат вызывает NumberFormatException
        try {
            Integer invalid = Integer.decode("0b101010"); // Бинарный формат не поддерживается
        } catch (NumberFormatException e) {
            System.out.println("Invalid format: " + e.getMessage());
        }
    }
}
