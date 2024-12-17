class A {
    int a;

    void method() {
        System.out.println("Method in class A");
    }
}

class B extends A {
    // Класс B не имеет своей переменной a или метода method
}

class C extends B {
    void method() {
        // Доступ к переменной a и методу method() из класса A через super
        int a = super.a;  // Доступ к переменной a из класса A
        super.method();    // Вызов метода method() из класса A

        System.out.println("Value of a: " + a);
    }
}

public class MethodExample {
    public static void main(String[] args) {
        C c = new C();
        c.method();
    }
}
