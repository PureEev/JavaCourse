import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args) {
        // Путь к файлу
        File file = new File("example.txt");

        // Использование try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(file)) {
            // Чтение данных из файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line); // Вывод строки
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
