// Собственное исключение, наследуемое от Exception
public class MyFirstException extends Exception {
    
    // Конструктор без параметров
    public MyFirstException() {
        super("Произошла ошибка в MyFirstException");
    }
    
    // Конструктор с параметром для сообщения об ошибке
    public MyFirstException(String message) {
        super(message);
    }
    
    // Конструктор с параметрами для сообщения об ошибке и причины
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
    
    // Конструктор с параметрами для сообщения, причины и флага "подавления" стека вызовов
    public MyFirstException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}


public class ExceptionTest {
    public static void main(String[] args) {
        try {
            // Генерация собственного исключения
            throw new MyFirstException("Это моё первое исключение!");
        } catch (MyFirstException e) {
            // Обработка собственного исключения
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}
