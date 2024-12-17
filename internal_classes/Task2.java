public class OuterClass {
    private int outerField = 10;
    
    public void outerMethod() {
        System.out.println("Outer method called");
    }

    public class InnerClass {
        public void accessOuterClass() {
            // Внутренний класс может обращаться к полям и методам внешнего класса
            System.out.println("Accessing outer field: " + outerField);
            outerMethod();
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        InnerClass inner = outer.new InnerClass();
        inner.accessOuterClass();
    }
}
