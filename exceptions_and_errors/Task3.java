public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация первого исключения (ArithmeticException), которое будет перехвачено
            int result = 10 / 0;  // Деление на ноль
            System.out.println("Результат: " + result);
            
            // Генерация второго исключения (NullPointerException), которое не будет перехвачено
            String str = null;
            System.out.println(str.length());  // Попытка вызвать метод на null, приводит к аварийной остановке
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());  // Обработка первого исключения
        }

        // После блока try-catch программа не продолжит выполнение из-за второго исключения
        System.out.println("Эта строка не будет выведена.");
    }
}
