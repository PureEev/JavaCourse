// Интерфейс с default методом и статическим методом
interface MyInterface {
    // Неабстрактный метод (метод по умолчанию)
    default void defaultMethod() {
        System.out.println("Это метод по умолчанию");
    }
    
    // Статический метод
    static void staticMethod() {
        System.out.println("Это статический метод интерфейса");
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {
    // Можно переопределить метод по умолчанию
    @Override
    public void defaultMethod() {
        System.out.println("Метод по умолчанию был переопределен");
    }
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // Вызов метода по умолчанию (переопределенного)
        obj.defaultMethod();  // Выведет: Метод по умолчанию был переопределен
        
        // Вызов статического метода интерфейса
        MyInterface.staticMethod();  // Выведет: Это статический метод интерфейса
    }
}
