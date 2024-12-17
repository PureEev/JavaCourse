// Класс с модификатором final
final class FinalClass {
    public void displayMessage() {
        System.out.println("Message from FinalClass");
    }
}

// Попытка наследования от final-класса вызовет ошибку компиляции
class Subclass extends FinalClass {
    // Ошибка компиляции, так как FinalClass не может быть унаследован
    @Override
    public void displayMessage() {
        System.out.println("Message from Subclass");
    }
}

public class SuperclassFinalMethodInheritance {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.displayMessage(); // Ошибка компиляции, так как FinalClass нельзя наследовать
    }
}
