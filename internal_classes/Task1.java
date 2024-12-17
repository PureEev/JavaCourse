public class OuterClass {

    // Пример публичного внутреннего класса
    public class PublicInnerClass {
        public void printMessage() {
            System.out.println("Message from PublicInnerClass");
        }
    }

    // Пример защищенного внутреннего класса
    protected class ProtectedInnerClass {
        public void printMessage() {
            System.out.println("Message from ProtectedInnerClass");
        }
    }

    // Пример default (пакетного) внутреннего класса
    class DefaultInnerClass {
        public void printMessage() {
            System.out.println("Message from DefaultInnerClass");
        }
    }

    // Пример приватного внутреннего класса
    private class PrivateInnerClass {
        public void printMessage() {
            System.out.println("Message from PrivateInnerClass");
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        // Доступ к публичному внутреннему классу
        PublicInnerClass publicInner = outer.new PublicInnerClass();
        publicInner.printMessage();
        
        // Доступ к защищенному внутреннему классу (из того же пакета или подкласса)
        ProtectedInnerClass protectedInner = outer.new ProtectedInnerClass();
        protectedInner.printMessage();
        
        // Доступ к внутреннему классу с default доступом
        DefaultInnerClass defaultInner = outer.new DefaultInnerClass();
        defaultInner.printMessage();
        
        // Доступ к приватному внутреннему классу невозможен извне
        // PrivateInnerClass privateInner = outer.new PrivateInnerClass(); // Ошибка компиляции
    }
}
