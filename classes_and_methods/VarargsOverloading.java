public class VarargsOverloading {

    // Метод для массива строк
    public static void printValues(String... strings) {
        System.out.print("String values: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    // Метод для смешанных объектов
    public static void printValues(Object... objs) {
        System.out.print("Mixed values: ");
        for (Object obj : objs) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printValues(1, 2, 3, 4);            // Будет вызван метод для Object...
        printValues("apple", "banana");     // Будет вызван метод для строк
        printValues(1, "two", 3.0, true);   // Вызов метода для смешанных объектов
    }
}
