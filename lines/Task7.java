import java.util.Formatter;

public class FlushExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("This is an example with %s%n", "flush");

        // Используем flush для немедленного вывода данных
        formatter.flush();  // Данные будут немедленно выведены на экран
        System.out.println("Data flushed!");
        formatter.close();
    }
}
