public class ArrayAssignmentExample {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};

        // Присваиваем ссылку массива a2 в массив a1
        a1 = a2; // a1 ссылается на a2

        // Выводим элементы массива a1
        System.out.println("a1 array elements:");
        for (int i : a1) {
            System.out.print(i + " ");
        }
    }
}
