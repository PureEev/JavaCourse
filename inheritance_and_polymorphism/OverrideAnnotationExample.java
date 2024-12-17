class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Ошибка, метод в классе Dog не переопределяет метод в классе Animal
    @Override
    public void makeNoises() {  // Ошибка: нет такого метода в суперклассе
        System.out.println("Dog barks");
    }
}

public class OverrideAnnotationExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoises();  // Ошибка компиляции
    }
}
