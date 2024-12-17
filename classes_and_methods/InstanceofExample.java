public class InstanceofExample {
    static class Wrapper<T> {
        private T item;

        public Wrapper(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        Wrapper<Integer> integerWrapper = new Wrapper<>(123);

        // Проверка типа содержимого через instanceof
        if (stringWrapper.getItem() instanceof String) {
            System.out.println("StringWrapper contains a String: " + stringWrapper.getItem());
        }

        if (integerWrapper.getItem() instanceof Integer) {
            System.out.println("IntegerWrapper contains an Integer: " + integerWrapper.getItem());
        }

        // Проверка типа самого объекта Wrapper
        if (stringWrapper instanceof Wrapper<?>) {
            System.out.println("stringWrapper is an instance of Wrapper<?>.");
        }

        if (integerWrapper instanceof Wrapper<?>) {
            System.out.println("integerWrapper is an instance of Wrapper<?>.");
        }
    }
}
