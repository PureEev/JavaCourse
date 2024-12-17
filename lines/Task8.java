import java.util.Formatter;
import java.util.Date;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        Date now = new Date();

        // Используем спецификатор %tH (Час 00–23)
        formatter.format("Hour (00-23): %tH%n", now);

        // Используем спецификатор %tY (Год в четырехзначном формате)
        formatter.format("Year (yyyy): %tY%n", now);

        // Используем спецификатор %tB (Полное название месяца)
        formatter.format("Month: %tB%n", now);

        // Используем спецификатор %tA (Полное название дня недели)
        formatter.format("Day of the week: %tA%n", now);

        // Используем спецификатор %tm (Месяц в двузначном формате)
        formatter.format("Month (mm): %tm%n", now);

        // Выводим отформатированную строку
        System.out.println(formatter.toString());

        // Закрываем Formatter
        formatter.close();
    }
}
