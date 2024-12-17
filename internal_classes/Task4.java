interface MyInterface {
    // Вложенный статический класс внутри интерфейса
    public static class NestedClass {
        public void display() {
            System.out.println("Метод вложенного класса внутри интерфейса");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Вызов вложенного класса через интерфейс
        MyInterface.NestedClass nestedClass = new MyInterface.NestedClass();
        nestedClass.display();
    }
}
