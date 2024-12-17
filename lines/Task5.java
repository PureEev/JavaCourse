public class StringConversionDemo {
    public static void main(String[] args) {
        // Преобразование String в StringBuilder
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String в StringBuilder: " + sb);  // Hello

        // Преобразование String в StringBuffer
        StringBuffer buffer = new StringBuffer(str);
        System.out.println("String в StringBuffer: " + buffer);  // Hello

        // Преобразование StringBuilder в String
        StringBuilder sb2 = new StringBuilder("World");
        String sb2ToStr = sb2.toString();
        System.out.println("StringBuilder в String: " + sb2ToStr);  // World

        // Преобразование StringBuffer в String
        StringBuffer buffer2 = new StringBuffer("Java");
        String buffer2ToStr = buffer2.toString();
        System.out.println("StringBuffer в String: " + buffer2ToStr);  // Java

        // Преобразование String в StringBuilder и обратно в String
        String str2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder(str2);
        String str3 = sb3.toString();
        System.out.println("Преобразование String в StringBuilder и обратно в String: " + str3);  // World
    }
}
