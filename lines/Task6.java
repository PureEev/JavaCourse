import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        // Используем спецификатор %b (логическое значение)
        boolean isJavaFun = true;
        formatter.format("Java is fun: %b%n", isJavaFun);

        // Используем спецификатор %c (символьное представление аргумента)
        char grade = 'A';
        formatter.format("Grade: %c%n", grade);

        // Используем спецификатор %d (десятичное целое значение)
        int num = 150;
        formatter.format("Number: %d%n", num);

        // Используем спецификатор %f (десятичное значение с плавающей точкой)
        double pi = 3.14159;
        formatter.format("Pi: %f%n", pi);

        // Используем спецификатор %s (строковое представление аргумента)
        String message = "Hello, Formatter!";
        formatter.format("Message: %s%n", message);

        // Выводим отформатированную строку
        System.out.println(formatter.toString());

        // Закрываем Formatter
        formatter.close();
    }
}
