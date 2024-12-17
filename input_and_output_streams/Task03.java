import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("example.txt")) {
            int charRead;
            while ((charRead = fr.read()) != -1) {
                System.out.print((char) charRead);  // Чтение и вывод символов
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Reader и Writer обеспечивают работу с текстовыми данными (символами) вместо байт,
    // предоставляя поддержку различных кодировок.
}
    