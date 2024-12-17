public class InfiniteLoopsExample {
    public static void main(String[] args) {
        // Бесконечный цикл while
        while (true) {
            System.out.println("This is an infinite while loop.");
            // Добавлен выход из цикла, чтобы не застрять
            break;
        }

        // Бесконечный цикл do-while
        do {
            System.out.println("This is an infinite do-while loop.");
            // Добавлен выход из цикла, чтобы не застрять
            break;
        } while (true);
    }
}
