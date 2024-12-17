// Первый интерфейс с default методом
interface InterfaceA {
    default void commonMethod() {
        System.out.println("Метод из InterfaceA");
    }
}

// Второй интерфейс с default методом
interface InterfaceB {
    default void commonMethod() {
        System.out.println("Метод из InterfaceB");
    }
}

// Класс, реализующий два интерфейса
class MyClass implements InterfaceA, InterfaceB {
    // Нужно переопределить метод, так как он конфликтует в обоих интерфейсах
    @Override
    public void commonMethod() {
        // Вручную указываем, какой метод из интерфейсов мы хотим вызвать
        InterfaceA.super.commonMethod();  // Вызовет метод из InterfaceA
        // Или
        InterfaceB.super.commonMethod();  // Вызовет метод из InterfaceB
    }
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.commonMethod();  // Выведет: Метод из InterfaceA или Метод из InterfaceB
    }
}
