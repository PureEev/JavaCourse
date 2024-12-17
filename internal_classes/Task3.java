public class OuterClass {
    private String outerField = "Outer field";
    
    public class InnerClass {
        private String innerField = "Inner field";
        
        public void printFields() {
            System.out.println("Inner field: " + innerField);
            System.out.println("Outer field from inner class: " + outerField);
        }
    }

    public void createAndPrintInnerClass() {
        InnerClass inner = new InnerClass();
        inner.printFields();  // Внешний класс может создать объект внутреннего класса
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createAndPrintInnerClass();
    }
}
