public class SwitchExample {
    public static void main(String[] args) {
        // 1. switch с целочисленным типом
        int value = 2;
        int i = 0;
        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        System.out.println("i = " + i); // Output: i = 2

        // 2. switch с типом char
        char c = 'B';
        switch (c) {
            case 'A':
                System.out.println("Character A");
                break;
            case 'B':
                System.out.println("Character B");
                break;
            default:
                System.out.println("Other character");
        }
        // Output: Character B

        // 3. switch с String
        String name = "John";
        switch (name) {
            case "John":
                System.out.println("Hello, John!");
                break;
            case "Jane":
                System.out.println("Hello, Jane!");
                break;
            default:
                System.out.println("Hello, Stranger!");
        }
        // Output: Hello, John!

        // 4. switch с enum
        Day today = Day.MONDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week");
                break;
            case FRIDAY:
                System.out.println("Almost weekend");
                break;
            default:
                System.out.println("Mid-week");
        }
        // Output: Start of the week
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
