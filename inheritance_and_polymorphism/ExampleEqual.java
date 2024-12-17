class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        // Проверка на идентичность (рефлексивность)
        if (this == obj) {
            return true;
        }

        // Проверка на null и принадлежность к тому же классу (согласованность типов)
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Приведение типа (класс Person)
        Person person = (Person) obj;

        // Сравнение значений полей (симметричность и транзитивность)
        return name.equals(person.name) && age == person.age;
    }

    // Переопределение метода toString() для удобного вывода
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Геттеры для name и age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("Alice", 30);

        // Сравнение объектов
        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
        System.out.println(person1.equals(null)); // false
    }
}
