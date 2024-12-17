public class B {
    // Способ 1: Инициализация при объявлении
    public final int x = 10;

    // Способ 2: Инициализация в конструкторе
    public final int y;

    // Способ 3: Инициализация в нестатическом блоке
    public final int z;

    // Нестатический блок инициализации
    {
        z = 30;
    }

    // Конструктор
    public B(int value) {
        this.y = value;
    }

    public static void main(String[] args) {
        // Создаём объект класса и передаём значение для y
        B obj = new B(20);

        // Вывод значений
        System.out.println("x = " + obj.x); // 10
        System.out.println("y = " + obj.y); // 20
        System.out.println("z = " + obj.z); // 30
    }
}
