public class MixedTypes {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;

        // Операция между int и double
        double result = a + b; // int автоматически преобразуется в double

        System.out.println(result); // 15.5
    }
}
