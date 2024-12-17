import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // Создаем StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");

        // Добавляем элементы
        joiner.add("Java");
        joiner.add("Python");
        joiner.add("C++");

        // Выводим результат
        System.out.println("StringJoiner: " + joiner.toString());  // Java, Python, C++

        // Можно также указать префикс и суффикс для заключения строки
        StringJoiner joinerWithPrefixSuffix = new StringJoiner(", ", "[", "]");
        joinerWithPrefixSuffix.add("Apple").add("Banana").add("Cherry");

        System.out.println("StringJoiner с префиксом и суффиксом: " + joinerWithPrefixSuffix.toString());  // [Apple, Banana, Cherry]
    }
}
