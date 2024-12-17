public class MethodOverloadingAndOverriding {

    // Перегрузка метода
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Переопределение метода
    static class Animal {
        public void makeSound() {
            System.out.println("Животное издает звук");
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Собака лает");
        }
    }

    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Кошка мяукает");
        }
    }

    public static void main(String[] args) {
        MethodOverloadingAndOverriding obj = new MethodOverloadingAndOverriding();

        // Примеры перегрузки методов
        System.out.println("Сумма двух целых чисел: " + obj.add(2, 3));
        System.out.println("Сумма двух дробных чисел: " + obj.add(2.5, 3.5));
        System.out.println("Сумма трех целых чисел: " + obj.add(2, 3, 4));
        System.out.println("Сумма нескольких чисел: " + obj.add(1, 2, 3, 4, 5));

        // Примеры переопределения методов
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();  // "Животное издает звук"
        myDog.makeSound();     // "Собака лает"
        myCat.makeSound();     // "Кошка мяукает"
    }
}
