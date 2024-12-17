public class CustomEnumExample {
    // Перечисление с описанием каждого дня недели
    public enum Day {
        MONDAY("Start of the work week"),
        TUESDAY("Second day of the work week"),
        WEDNESDAY("Mid-week"),
        THURSDAY("Almost Friday"),
        FRIDAY("End of the work week"),
        SATURDAY("Weekend begins"),
        SUNDAY("Weekend ends");

        private final String description;

        // Конструктор перечисления
        Day(String description) {
            this.description = description;
        }

        // Метод для получения описания
        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        // Перебор значений перечисления
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }

        // Пример использования метода
        Day today = Day.FRIDAY;
        System.out.println("Today is " + today + ": " + today.getDescription());
    }
}
