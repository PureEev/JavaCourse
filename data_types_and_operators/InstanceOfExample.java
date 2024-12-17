public class InstanceOfExample {
    public static void main(String[] args) {
        Object obj1 = "Hello, World!";
        Object obj2 = 123;
        Object obj3 = null;

        // Проверка объекта на принадлежность к классу
        System.out.println("obj1 instanceof String: " + (obj1 instanceof String)); // true
        System.out.println("obj2 instanceof Integer: " + (obj2 instanceof Integer)); // true
        System.out.println("obj3 instanceof String: " + (obj3 instanceof String)); // false

        // Пример с наследованием
        Animals animal = new Dogs();
        System.out.println("animal instanceof Animal: " + (animal instanceof Animals)); // true
        System.out.println("animal instanceof Dog: " + (animal instanceof Dogs)); // true

        // Пример с null
        Animals nullAnimal = null;
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animals)); // false
    }
}

// Пример классов для демонстрации instanceof
class Animals {
}

class Dogs extends Animals {
}
