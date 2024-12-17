public class StringMethodsDemo {
    public static void main(String[] args) {
        String str1 = "Java programming";
        String str2 = "is fun";

        // 1. length() - Возвращает длину строки
        System.out.println("Длина строки str1: " + str1.length());  // 19

        // 2. charAt() - Возвращает символ по индексу
        System.out.println("Символ на позиции 5 в str1: " + str1.charAt(5));  // 'p'

        // 3. substring() - Возвращает подстроку
        System.out.println("Подстрока str1 с 5 по 10 индекс: " + str1.substring(5, 10));  // "prog"

        // 4. toLowerCase() - Преобразует строку в нижний регистр
        System.out.println("str1 в нижнем регистре: " + str1.toLowerCase());  // "java programming"

        // 5. toUpperCase() - Преобразует строку в верхний регистр
        System.out.println("str1 в верхнем регистре: " + str1.toUpperCase());  // "JAVA PROGRAMMING"

        // 6. contains() - Проверяет, содержит ли строка подстроку
        System.out.println("str1 содержит 'Java': " + str1.contains("Java"));  // true

        // 7. replace() - Заменяет все вхождения одного символа на другой
        System.out.println("str1 после замены 'a' на 'o': " + str1.replace('a', 'o'));  // "Jovo progromming"

        // 8. split() - Разделяет строку на массив подстрок по заданному разделителю
        String[] words = str1.split(" ");
        System.out.println("Разделенные слова из str1:");
        for (String word : words) {
            System.out.println(word);  // "Java" "programming"
        }

        // 9. trim() - Убирает лишние пробелы в начале и в конце строки
        String str3 = "  Hello World  ";
        System.out.println("str3 после trim(): '" + str3.trim() + "'");  // "Hello World"

        // 10. concat() - Конкатенирует строки
        System.out.println("Результат конкатенации str1 и str2: " + str1.concat(" " + str2));  // "Java programming is fun"
    }
}
