public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        // Пример для StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        
        // 1. append() - Добавляет строку в конец
        sb.append(" Programming");
        System.out.println("После append: " + sb);  // Java Programming

        // 2. insert() - Вставляет строку в указанную позицию
        sb.insert(4, " Language");
        System.out.println("После insert: " + sb);  // Java Language Programming

        // 3. delete() - Удаляет часть строки по индексам
        sb.delete(4, 12);  
        System.out.println("После delete: " + sb);  // Java Programming

        // 4. reverse() - Разворачивает строку
        sb.reverse();
        System.out.println("После reverse: " + sb);  // gnimmargorP avaJ

        // 5. replace() - Заменяет часть строки
        sb.replace(0, 6, "Java");
        System.out.println("После replace: " + sb);  // JavaavaJ

        // Пример для StringBuffer
        StringBuffer buffer = new StringBuffer("Hello");

        // 6. append() - Добавляет строку в конец
        buffer.append(" World");
        System.out.println("После append в StringBuffer: " + buffer);  // Hello World

        // 7. insert() - Вставляет строку в указанную позицию
        buffer.insert(6, "Beautiful ");
        System.out.println("После insert в StringBuffer: " + buffer);  // Hello Beautiful World

        // 8. delete() - Удаляет часть строки
        buffer.delete(6, 17);
        System.out.println("После delete в StringBuffer: " + buffer);  // Hello World

        // 9. capacity() - Возвращает текущую ёмкость StringBuffer
        System.out.println("Ёмкость StringBuffer: " + buffer.capacity());

        // 10. setLength() - Устанавливает длину строки
        buffer.setLength(5);
        System.out.println("После setLength: " + buffer);  // Hello
    }
}
