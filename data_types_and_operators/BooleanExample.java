public class BooleanExample {

    public static void main(String[] args) {
        // 1. Использование метода valueOf() с различными параметрами
        Boolean b1 = Boolean.valueOf(true);       // true
        Boolean b2 = Boolean.valueOf("true");     // true
        Boolean b3 = Boolean.valueOf("false");    // false
        Boolean b4 = Boolean.valueOf("TrUe");     // true (регистр игнорируется)
        Boolean b5 = Boolean.valueOf("anything"); // false (любой другой текст)

        // 2. Автоупаковка (boxing)
        Boolean b6 = true;   // true (автоматическая упаковка)

        // Вывод результатов
        System.out.println("b1: " + b1);  // true
        System.out.println("b2: " + b2);  // true
        System.out.println("b3: " + b3);  // false
        System.out.println("b4: " + b4);  // true
        System.out.println("b5: " + b5);  // false
        System.out.println("b6: " + b6);  // true

        // Пример с автоупаковкой для других значений
        Boolean b7 = Boolean.valueOf("True"); // true
        Boolean b8 = Boolean.valueOf("false"); // false
        System.out.println("b7: " + b7);  // true
        System.out.println("b8: " + b8);  // false
    }
}
