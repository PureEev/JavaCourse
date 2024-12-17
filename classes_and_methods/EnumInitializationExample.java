public class EnumInitializationExample {
    // Перечисление с сезонами года
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        // Инициализация перечисления
        Season currentSeason = Season.SPRING;

        // Использование в конструкции switch
        switch (currentSeason) {
            case WINTER:
                System.out.println("It's cold outside!");
                break;
            case SPRING:
                System.out.println("Flowers are blooming!");
                break;
            case SUMMER:
                System.out.println("Time to go to the beach!");
                break;
            case AUTUMN:
                System.out.println("Leaves are falling!");
                break;
        }
    }
}
