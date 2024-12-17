class A {
    int a;
    int b;
    int c;
    int z;

    // Конструктор по умолчанию
    public A() {
        this(0);  // Вызов другого конструктора
    }

    // Конструктор с одним параметром
    public A(int a) {
        this(a, 0);  // Вызов другого конструктора
        z = 1;
    }

    // Конструктор с двумя параметрами
    public A(int a, int b) {
        this(a, b, 0);  // Вызов другого конструктора
        z = 1;
    }

    // Конструктор с тремя параметрами
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }

    // Метод для вывода значений
    public void display() {
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", z: " + z);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        A obj = new A(10, 20);
        obj.display();
    }
}
