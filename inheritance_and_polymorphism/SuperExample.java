class Superclass {
    int num;

    // Конструктор суперкласса
    public Superclass(int num) {
        this.num = num;
    }

    // Метод суперкласса
    public void display() {
        System.out.println("Superclass display: " + num);
    }
}

class Subclass extends Superclass {
    int num;

    // Конструктор подкласса
    public Subclass(int num1, int num2) {
        // Вызов конструктора суперкласса с помощью super()
        super(num1);
        this.num = num2;
    }

    // Метод для доступа к полю суперкласса
    public void showSuperclassField() {
        // Доступ к полю суперкласса с помощью super
        System.out.println("Superclass field num: " + super.num);
    }

    // Переопределение метода суперкласса
    @Override
    public void display() {
        // Вызов метода суперкласса с помощью super
        super.display();
        System.out.println("Subclass display: " + num);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        // Создание объекта подкласса
        Subclass subclass = new Subclass(10, 20);

        // Доступ к полю суперкласса через метод
        subclass.showSuperclassField();

        // Вызов метода суперкласса
        subclass.display();
    }
}
