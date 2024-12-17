public class OperatorsExample {

    public static void main(String[] args) {
        // Примеры для базовых типов
        int a = 10; // Присваивание
        double b = 5.5;
        boolean flag = true;

        System.out.println("Изначальные значения:");
        System.out.println("a = " + a + ", b = " + b + ", flag = " + flag);

        // Операторы +=, -=, *=, /=
        a += 5; // a = 15
        b -= 2.5; // b = 3.0
        System.out.println("\nПосле += и -=:");
        System.out.println("a = " + a + ", b = " + b);

        a *= 2; // a = 30
        b /= 1.5; // b = 2.0
        System.out.println("\nПосле *= и /=:");
        System.out.println("a = " + a + ", b = " + b);

        // Оператор %=
        a %= 7; // a = 2
        System.out.println("\nПосле %=: a = " + a);

        // Тернарный оператор ?:
        String result = (a > b) ? "a больше b" : "a не больше b";
        System.out.println("\nТернарный оператор: " + result);

        // Логические операторы || и &&
        boolean c = (a > 1) || (b < 1); // true
        boolean d = (a > 1) && (b < 1); // false
        System.out.println("\nЛогические операторы:");
        System.out.println("c (||) = " + c + ", d (&&) = " + d);

        // Побитовые операторы |, &, ^, ~
        int x = 5;  // 0101
        int y = 3;  // 0011
        System.out.println("\nПобитовые операторы:");
        System.out.println("x | y = " + (x | y));  // 0111 = 7
        System.out.println("x & y = " + (x & y));  // 0001 = 1
        System.out.println("x ^ y = " + (x ^ y));  // 0110 = 6
        System.out.println("~x = " + (~x));        // 1111...1010 (доп. код)

        // Сравнительные операторы >, >=, <, <=, ==
        System.out.println("\nСравнительные операторы:");
        System.out.println("x > y = " + (x > y));   // true
        System.out.println("x > y = " + (x >= y));   // true
        System.out.println("x <= y = " + (x < y)); // false
        System.out.println("x <= y = " + (x <= y)); // false
        System.out.println("x == y = " + (x == y)); // false

        // Сдвиги >>, <<, >>>
        int z = 8;  // 1000
        System.out.println("\nОператоры сдвига:");
        System.out.println("z >> 2 = " + (z >> 2));  // 0010 = 2
        System.out.println("z << 2 = " + (z << 2));  // 100000 = 32
        System.out.println("z >>> 2 = " + (z >>> 2));// 0010 = 2

        // Операторы +, -
        int sum = x + y; // 8
        int diff = x - y; // 2
        System.out.println("\nАрифметические операторы:");
        System.out.println("x + y = " + sum + ", x - y = " + diff);

        // Операторы * и /
        int product = x * y; // 15
        int remains = product % 5;
        System.out.println("product % 5 = " + remains);
        double quotient = (double) x / y; // 1.666...
        System.out.println("x * y = " + product + ", x / y = " + quotient);

        // Префиксная и постфиксная форма ++, --
        int p = 5;
        System.out.println("\nИнкремент и декремент:");
        System.out.println("Префиксный ++: " + (++p)); // 6
        System.out.println("Постфиксный ++: " + (p++)); // 6, потом p = 7
        System.out.println("После постфиксного ++: " + p);
        System.out.println("Префиксный --: " + (--p)); // 6
        System.out.println("Постфиксный --: " + (p--)); // 6, потом p = 5
        System.out.println("После постфиксного --: " + p);

        // Операторы с объектами типа String
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("\nОператоры со String:");
        System.out.println("Конкатенация (+): " + (s1 + " " + s2)); // Hello World
        s1 += " Java";
        System.out.println("+= с String: " + s1);

        System.out.println("Сравнение ==: " + (s1 == "Hello Java")); // false (сравнение ссылок)
        System.out.println("Сравнение equals: " + s1.equals("Hello Java")); // true

        // Операторы () и []
        int[] numbers = {1, 2, 3};
        System.out.println("\nОператоры () и []:");
        System.out.println("Элемент массива numbers[1]: " + numbers[1]); // 2

        byte t = 12;  // В двоичном: 00001100
        System.out.println("~b = " + (~t));  // Инверсия битов: -13 (доп. код)

        boolean isTrue = true;
        System.out.println("!isTrue = " + (!isTrue));  // false

        int Result = (3 + 5) * 2;  // Скобки меняют порядок операций
        System.out.println("Результат: " + Result);  // 16

    }
}
