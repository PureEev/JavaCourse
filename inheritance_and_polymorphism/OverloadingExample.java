class Calculator {
    // Перегруженный метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов различных перегруженных методов
        System.out.println(calculator.add(5, 10));            // 15 (целые числа)
        System.out.println(calculator.add(5, 10, 15));        // 30 (целые числа)
        System.out.println(calculator.add(5.5, 10.5));        // 16.0 (числа с плавающей запятой)
    }
}
