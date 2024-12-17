// Пример для демонстрации работы с разными спецификаторами доступа

public class AccessModifiersExample {

    // Члены класса с разными спецификаторами доступа
    private int privateVar = 1;     // Доступно только в этом классе
    int defaultVar = 2;              // Доступно в том же пакете
    protected int protectedVar = 3; // Доступно в том же пакете и в подклассах
    public int publicVar = 4;       // Доступно всем классам

    // Конструктор с разными спецификаторами
    public AccessModifiersExample() {
        System.out.println("Конструктор с public доступом");
    }

    // Пример методов с разными спецификаторами
    private void privateMethod() {
        System.out.println("Private Method: Доступно только внутри этого класса.");
    }

    void defaultMethod() {
        System.out.println("Default Method: Доступно внутри того же пакета.");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: Доступно в том же пакете и подклассам.");
    }

    public void publicMethod() {
        System.out.println("Public Method: Доступно всем классам.");
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Доступ к полям и методам с разными спецификаторами
        System.out.println("Private var: недоступен за пределами класса");
        // System.out.println(example.privateVar); // Ошибка! privateVar недоступна

        System.out.println("Default var: " + example.defaultVar); // Доступно в том же пакете
        System.out.println("Protected var: " + example.protectedVar); // Доступно в том же пакете или в подклассах
        System.out.println("Public var: " + example.publicVar); // Доступно всем классам

        // Вызовы методов
        // example.privateMethod(); // Ошибка! privateMethod недоступен
        example.defaultMethod();   // Доступно в том же пакете
        example.protectedMethod(); // Доступно в том же пакете или в подклассах
        example.publicMethod();    // Доступно всем классам
    }
}
