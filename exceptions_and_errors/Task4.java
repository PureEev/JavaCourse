public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация исключений
            throw new ArithmeticException("Arithmetic Exception");
            //throw new NullPointerException("Null Pointer Exception"); // Можно раскомментировать для тестирования
        } catch (ArithmeticException | NullPointerException e) {
            // Обработка двух исключений одинаково
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            // Генерация исключений, образующих иерархию
            throw new RuntimeException("Runtime Exception");  // Это исключение является подклассом Exception
        } catch (Exception e) {
            // Обработка всех исключений из иерархии Exception
            System.out.println("Обработано исключение: " + e.getMessage());
        }

        try {
            // Генерация исключений из более узкой иерархии
            throw new IllegalArgumentException("Illegal Argument Exception");  // Это исключение является подклассом RuntimeException
        } catch (IllegalArgumentException e) {
            // Обработка исключения, наследующегося от RuntimeException
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
