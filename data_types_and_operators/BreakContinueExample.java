public class BreakContinueExample {
    public static void main(String[] args) {
        // Пример с break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop when i equals 5.");
                break; // Выход из цикла
            }
            System.out.println("i = " + i);
        }

        // Пример с continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Skipping i = 5");
                continue; // Пропуск итерации
            }
            System.out.println("i = " + i);
        }
    }
}
