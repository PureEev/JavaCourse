class Superclass {
    // Метод с модификатором final
    public final void displayMessage() {
        System.out.println("Message from Superclass");
    }
}

class Subclass extends Superclass {
    // Попытка переопределить final-метод вызовет ошибку компиляции
    @Override
    public void displayMessage() {
        System.out.println("Message from Subclass");
    }
}

public class SuperclassFinalMethod {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.displayMessage(); // Ошибка компиляции, так как метод final не может быть переопределен
    }
}
