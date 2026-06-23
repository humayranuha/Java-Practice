enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enums {
    public static void main(String[] args) {
        Level myVar = Level.HIGH;

        switch(myVar) {
            case LOW:
                System.out.println("Low");
                break;
            case MEDIUM:
                System.out.println("Medium");
                break;
            case HIGH:
                System.out.println("High");
                break;
            default:
                System.out.println("No match");
        }

        for (Level var: Level.values()) {
            System.out.println(var);
        }
    }
}
