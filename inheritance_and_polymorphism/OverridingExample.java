class Animal {
    // Метод в суперклассе
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Переопределение метода в подклассе
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Вывод: Animal makes a sound

        Dog dog = new Dog();
        dog.sound();     // Вывод: Dog barks
    }
}

//Если тип возвращаемого значения в переопределенном методе не
// совпадает с типом в методе суперкласса, то будет ошибка компиляции.