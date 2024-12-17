import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(65);  // Запись одного байта (в данном случае символ 'A' с кодом 65)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
