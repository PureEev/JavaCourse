import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести имя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine(); // Читаем введенную строку

        // Выводим приветствие
        System.out.println("Привет, " + name + "!");

        // Закрываем Scanner
        scanner.close();
    }
}
