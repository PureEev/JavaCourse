import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// 1: Использование встроенных аннотаций

class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    // Переопределение метода с использованием аннотации @Override
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class OldClass {
    // Метод, помеченный как устаревший с использованием аннотации @Deprecated
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

public class Main {
    public static void main(String[] args) {
        // Пример использования @Override
        Animal dog = new Dog();
        dog.makeSound();  // Выведет: Bark

        // Пример использования @Deprecated
        OldClass obj = new OldClass();
        obj.oldMethod();  // Это вызовет предупреждение компилятора о том, что метод устарел.
    }
}

// 2: Создание собственной аннотации

// Определение аннотации BaseAction
@Target(ElementType.TYPE)  // Аннотация может применяться только к типам (классам)
public @interface BaseAction {
    int level();
}

// Применение аннотации BaseAction к классу Base
@BaseAction(level = 2)
class Base {
    public void doAction() {
        // Получение и вывод значения аннотации
        Class<?> clazz = Base.class;
        BaseAction action = clazz.getAnnotation(BaseAction.class);  // Получаем аннотацию
        System.out.println("Action Level: " + action.level());  // Выводим значение уровня
    }
}

class MainAnnotationExample {
    public static void main(String[] args) {
        // Создаем объект класса Base и вызываем метод doAction
        Base base = new Base();
        base.doAction();  // Выведет: Action Level: 2
    }
}
