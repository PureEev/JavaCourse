import java.util.ArrayList;
import java.util.List;

public class WildcardsExample {
    static class Animal {
        public void sound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    // Метод для работы с <? extends T>
    public static void printAnimalSounds(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound(); // Безопасно вызывать методы Animal
        }
    }

    // Метод для работы с <? super T>
    public static void addDogsToList(List<? super Dog> dogs) {
        dogs.add(new Dog()); // Разрешено добавлять Dog или его подтипы
        System.out.println("Added a Dog to the list.");
    }

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();

        // Работа с <? extends T>
        dogList.add(new Dog());
        printAnimalSounds(dogList); // Подходит, Dog является подтипом Animal

        // Работа с <? super T>
        addDogsToList(animalList); // Подходит, Animal является супертипом Dog
        addDogsToList(dogList); // Подходит, List<Dog> точно соответствует Dog

        // Вывод добавленных объектов
        for (Animal animal : animalList) {
            animal.sound();
        }
    }
}
