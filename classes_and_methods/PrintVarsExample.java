public class PrintVarsExample {
    public static void main(String[] args) {
        // Вариант 1: Вызов метода через имя класса
        B.printVars();

        // Вариант 2: Вызов метода через объект класса
        B instance = new B();
        instance.printVars();
    }
}

class B {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}
