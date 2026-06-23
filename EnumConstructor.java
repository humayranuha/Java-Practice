enum Level {
    // Enum constants (each has its own description)
    LOW("low level"),
    MEDIUM("medium level"),
    HIGH("high level");

    // Field (variable) to store the description text
    private String description;

    // Constructor (runs once for each constant above)
    private Level(String description) {
        this.description = description;
    }

    // Getter method to read the description
    public String getDescription() {
        return description;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        System.out.println("My variable: " + myVar + " - " + myVar.getDescription());

        for (Level level : Level.values()) {
            System.out.println(level.getDescription());
        }
    }
}