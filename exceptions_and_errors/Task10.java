public class Task01 {
    final static int START_COUNTER;
    
    static {
        START_COUNTER = Integer.parseInt("Y-"); // Произойдет NumberFormatException
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // Из-за возникновения NumberFormatException в статическом блоке main не будет выполнен
        // и "Hello" не будет напечатано.
    }
    // Метод Integer.parseInt("Y-") пытается преобразовать строку "Y-" в целое число.
    // Это вызовет NumberFormatException.
    // Из-за этой ошибки программа завершится на этапе выполнения статического блока
    // и метод main не будет вызван, так что "Hello" не напечатается.
}