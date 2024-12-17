import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Пример использования toString()
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array as String: " + Arrays.toString(arr1));

        // Пример использования binarySearch()
        int[] arr2 = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(arr2, 3);
        System.out.println("Index of element 3: " + index);

        // Пример использования equals()
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3, 4, 5};
        boolean areEqual = Arrays.equals(arr3, arr4);
        System.out.println("Arrays are equal: " + areEqual);

        // Пример использования compare()
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {1, 2, 4};
        int compareResult = Arrays.compare(arr5, arr6);
        System.out.println("Comparison result between arr5 and arr6: " + compareResult);

        // Пример использования sort()
        int[] arr7 = {5, 3, 8, 1, 2};
        Arrays.sort(arr7);
        System.out.println("Sorted array: " + Arrays.toString(arr7));
    }
}
