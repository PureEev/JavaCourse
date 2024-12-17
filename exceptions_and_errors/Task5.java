public class Task02 {
    public static void main(String[] args) {
        try {
            throw new Exception("Example Exception");
        } catch (final Exception e) {
            System.out.println("Caught exception with final: " + e.getMessage());
            // Caught exception with final: Example Exception
        }
    }
}