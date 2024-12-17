public class DataTypes {
    public static void main(String[] args) {
        // Целочисленные типы
        byte b = 0;             // 8 бит, нулевое значение 0
        short s = 0;            // 16 бит, нулевое значение 0
        int i = 0;              // 32 бита, нулевое значение 0
        long l = 0L;            // 64 бита, нулевое значение 0L

        // С плавающей точкой
        float f = 0.0f;         // 32 бита, нулевое значение 0.0f
        double d = 0.0;         // 64 бита, нулевое значение 0.0

        // Символьный тип
        char c = '\u0000';      // 16 бит, нулевое значение '\u0000' (нулевой символ)

        // Булевский тип
        boolean bool = false;   // Нулевое значение false

        // Вывод значений
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
